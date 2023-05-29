
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
		System.out.println("Give a string:");
		String str = scan.nextLine();
		System.out.println("Give an integer:");
		int numInt = Integer.valueOf(scan.nextLine());
		System.out.println("Give a double:");
		double numFloat = Double.valueOf(scan.nextLine());
		System.out.println("Give a boolean:");
		boolean trueFalse = Boolean.valueOf(scan.nextLine());
		System.out.println("You gave the string " + str);
		System.out.println("You gave the integer " + numInt);
		System.out.println("You gave the double " + numFloat);
		System.out.println("You gave the boolean " + trueFalse);

    }
}
