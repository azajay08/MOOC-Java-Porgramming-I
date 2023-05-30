
import java.util.Scanner;

public class FirstWords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			String str = scanner.nextLine();
			if (str.equals("")) {
				break;
			}
			String[] strSplit = str.split(" ");
			System.out.println(strSplit[0]);
		}
	}
}
