import java.util.Scanner;

public class UserInterface {
	private TodoList list;
	private Scanner scan;

	public UserInterface(TodoList list, Scanner scanner) {
		this.list = list;
		this.scan = scanner;
	}

	public void addTodo() {
		System.out.println("To add: ");
		String toDo = this.scan.nextLine();
		this.list.add(toDo);
	}

	public void removeTodo() {
		System.out.println("Which one is removed? ");
		int toRemove = Integer.valueOf(this.scan.nextLine());
		if (toRemove <= this.list.size())
		this.list.remove(toRemove);
	}

	public void start() {
		while (true) {
			System.out.print("Command: ");
			String command = this.scan.nextLine();
			if (command.equals("stop")) {
				break;
			} else if (command.equals("add")) {
				this.addTodo();
			} else if (command.equals("list")) {
				this.list.print();
			} else if (command.equals("remove")) {
				this.removeTodo();
			}

		}
	}
}
