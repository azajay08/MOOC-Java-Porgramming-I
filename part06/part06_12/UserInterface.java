import java.util.Scanner;

public class UserInterface {
	
	private JokeManager jokes;
	private Scanner scan;

	public UserInterface(JokeManager jokes, Scanner scan) {
		this.jokes = jokes;
		this.scan = scan;
	}

	public void addJokes() {
		System.out.println("Write the joke to be added: ");
		String joke = this.scan.nextLine();
		this.jokes.addJoke(joke);
	}

	public void start() {
		while (true) {
			System.out.println("Commands:");
			System.out.println(" 1 - add a joke");
			System.out.println(" 2 - draw a joke");
			System.out.println(" 3 - list jokes");
			System.out.println(" X - stop");

			String command = this.scan.nextLine();

			if (command.equals("X")) {
				break;
			}

			if (command.equals("1")) {
				addJokes();
			}

			if (command.equals("2")) {
				System.out.println(this.jokes.drawJoke());;
			}

			if (command.equals("3")) {
				this.jokes.printJokes();
			}
		}
	}
}
