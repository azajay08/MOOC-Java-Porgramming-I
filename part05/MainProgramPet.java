
import java.util.Scanner;

public class MainProgramPet {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pet hulda = new Pet("Hulda", "Golden retriever");
        PersonPet leo = new PersonPet("Leo", hulda);

        System.out.println(leo);
    }
}
