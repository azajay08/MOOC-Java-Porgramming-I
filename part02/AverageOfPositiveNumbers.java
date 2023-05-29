
import java.util.Scanner;

public class AverageOfPositiveNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		double count = 0.0;
		double avg = 0.0;
		while (true) {
			System.out.println("Give a number:");
			int number = Integer.valueOf(scanner.nextLine());
		
			if (number == 0) {
				break;
			}

			if (number > 0) {
				sum += number;
				count += 1.0;
			}
		}
		if (count == 0.0) {
			System.out.println("Cannot calculate the average");
		} else {
			avg = sum / count;
			System.out.println(avg);
		}
	}
}
