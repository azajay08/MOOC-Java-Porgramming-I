public class Statistics {

	private int count;
	private int sum;

	public Statistics() {
		// initialize the variables count and sum here
	}

	public void addNumber(int number) {
		// write code here
		this.sum += number;
		this.count++;
	}

	public int getCount() {
		return this.count;
		// write code here
	}

	public int sum() {
		return this.sum;
		// write code here
	}

	public double average() {
		if (this.count == 0) {
			return 0;
		}
		double count = this.count;
		return this.sum / count;
		// write code here
	}
}

/*
 * 
 * 
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		Statistics statistics = new Statistics();
		Statistics evens = new Statistics();
		Statistics odds = new Statistics();
		System.out.println("Enter numbers:");
		while (true) {
			int num = Integer.valueOf(scanner.nextLine());
			if (num == -1) {
				break;
			}

			if (num % 2 == 0) {
				evens.addNumber(num);
			} else {
				odds.addNumber(num);
			}
			statistics.addNumber(num);
		}
		System.out.println("Sum: " + statistics.sum());
		System.out.println("Sum of even numbers: " + evens.sum());
		System.out.println("Sum of odd numbers: " + odds.sum());

        // statistics.addNumber(3);
        // statistics.addNumber(5);
        // statistics.addNumber(1);
        // statistics.addNumber(2);
        // System.out.println("Count: " + statistics.getCount());
        // System.out.println("Sum: " + statistics.sum());
        // System.out.println("Average: " + statistics.average());
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
    }
}

 */