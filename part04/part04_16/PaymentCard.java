public class PaymentCard {

	private double balance;

	public PaymentCard(double openingBalance) {
		this.balance = openingBalance;
		// write code here
	}

	public String toString() {
		return "The card has a balance of " + this.balance + " euros";
		// write code here
	}

	public void eatAffordably() {
		// write code here
		if (this.balance - 2.60 >= 0) {
			this.balance -= 2.60;
		}
	}
	
	public void eatHeartily() {
		// write code here
		if (this.balance - 4.60 >= 0) {
			this.balance -= 4.60;
		}
	}

	public void addMoney(double amount) {
		// write code here
		if (amount < 0) {
			return;
		}
		if (this.balance + amount >= 150.0) {
			this.balance = 150.0;
		} else {
			this.balance += amount;
		}
	}
}