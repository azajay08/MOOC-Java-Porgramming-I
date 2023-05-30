public class Debt {
	private Double balance;
	private Double interest;

	public Debt(double initialBalance, double initialInterestRate) {
		this.balance = initialBalance;
		this.interest = initialInterestRate;
	}

	public void printBalance() {
		System.out.println(this.balance);
	}

	public void waitOneYear() {
		this.balance *= this.interest;
	}
}

/*
 * 
 * MAIN 
 * 
 * public class Main {

	public static void main(String[] args) {
		// Test your Debt class here
		Debt mortgage = new Debt(120000.0, 1.01);
		mortgage.printBalance();

		mortgage.waitOneYear();
		mortgage.printBalance();

		int years = 0;

		while (years < 20) {
		   mortgage.waitOneYear();
		   years = years + 1;
		}

		mortgage.printBalance();
	}
}
 */