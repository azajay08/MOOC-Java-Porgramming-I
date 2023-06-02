
public class MainTwins {

	public static void main(String[] args) {
		// you can write code here to try out your program
		SimpleDateTwins date = new SimpleDateTwins(24, 3, 2017);
		SimpleDateTwins date2 = new SimpleDateTwins(23, 7, 2017);

		PersonTwins leo = new PersonTwins("Leo", date, 62, 9);
		PersonTwins lily = new PersonTwins("Lily", date2, 65, 8);

		if (leo.equals(lily)) {
			System.out.println("Is this quite correct?");
		}

		PersonTwins leoWithDifferentWeight = new PersonTwins("Leo", date, 62, 10);

		if (leo.equals(leoWithDifferentWeight)) {
			System.out.println("Is this quite correct?");
		}
	}
}
	