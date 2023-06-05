
import java.util.Scanner;

public class Cubes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cubed = 0;
		while (true) {
			String line = scanner.nextLine();
			if (line.equals("end")) {
				break;
			}
			int num = Integer.valueOf(line);
			cubed = num * num * num;
			// add the read line to a list for later
			// handling or handle the line immediately
			System.out.println(cubed);
		}
	}
}
