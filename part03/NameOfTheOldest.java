
import java.util.Scanner;

public class NameOfTheOldest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int biggest = 0;
		String oldest = "";
		while (true) {
			String str = scanner.nextLine();
			if (str.equals("")) {
				break;
			}
			String[] strSplit = str.split(",");
			if (Integer.valueOf(strSplit[1]) > biggest) {
				biggest = Integer.valueOf(strSplit[1]);
				oldest = strSplit[0];
			}
		}
		System.out.println("Name of the oldest: " + oldest);

	}
}
