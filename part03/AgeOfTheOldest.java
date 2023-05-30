
import java.util.Scanner;

public class AgeOfTheOldest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int biggest = 0;
		while (true) {
			String str = scanner.nextLine();
			if (str.equals("")) {
				break;
			}
			String[] strSplit = str.split(",");
			if (Integer.valueOf(strSplit[1]) > biggest) {
				biggest = Integer.valueOf(strSplit[1]);
			}
		}
		System.out.println("Age of the oldest: " + biggest);

	}
}
