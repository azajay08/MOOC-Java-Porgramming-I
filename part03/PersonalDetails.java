
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int biggest = 0;
		int years = 0;
		double count = 0.0;
		String longest = "";
		while (true) {
			String str = scanner.nextLine();
			if (str.equals("")) {
				break;
			}
			count++;
			String[] strSplit = str.split(",");
			years += Integer.valueOf(strSplit[1]);
			if (strSplit[0].length() > biggest) {
				biggest = strSplit[0].length();
				longest = strSplit[0];
			}
		}
		System.out.println("Longest name: " + longest);
		System.out.println("Average of the birth years: " + years / count);

	}
}
