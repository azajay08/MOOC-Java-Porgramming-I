
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Results results = new Results();
		System.out.println("Enter point totals, -1 stops:");
		while (true) {
			int points = Integer.valueOf(scanner.nextLine());
			if (points == -1) {
				break;
			} else if (points >= 0 && points <= 100) {
				Points newPoints = new Points(points);
				results.addPoints(newPoints);
			}
		}
		results.printResults();
	}
}
