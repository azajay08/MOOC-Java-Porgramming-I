
import java.util.Scanner;

public class GradesAndPoints {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Give points [0-100]:");
		int score = Integer.valueOf(scan.nextLine());
		String grade = "";
		if (score < 0) {
			grade = "impossible!";
		} else if (score < 50) {
			grade = "failed";
		} else if (score < 60) {
			grade = "1";
		} else if (score < 70) {
			grade = "2";
		} else if (score < 80) {
			grade = "3";
		} else if (score < 90) {
			grade = "4";
		} else if (score <= 100) {
			grade = "5";
		} else {
			grade = "incredible!";
		}
		System.out.println("Grade: " + grade);
	}
}
