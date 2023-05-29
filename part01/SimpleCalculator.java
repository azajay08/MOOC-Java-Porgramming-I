
import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Write your program here
		System.out.println("Give the first number:");
		int first = Integer.valueOf(scanner.nextLine());
		System.out.println("Give the second number:");
		int second = Integer.valueOf(scanner.nextLine());
		int sumResult = first + second;
		int subResult = first - second;
		int multiResult = first * second;
		double divResult = Double.valueOf(first) / Double.valueOf(second);

		System.out.println(first + " + " + second + " = " + sumResult);
		System.out.println(first + " - " + second + " = " + subResult);
		System.out.println(first + " * " + second + " = " + multiResult);
		System.out.println(first + " / " + second + " = " + divResult);

	}
}
