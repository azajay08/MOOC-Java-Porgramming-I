
import java.util.Scanner;

public class PrintThrice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Write your program here
		String input = scanner.nextLine();
		String result = input + input + input;
		System.out.println(result);
	}
}
