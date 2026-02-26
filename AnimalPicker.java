import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Which animal would you like to see? (dog/cat): ");
        String choice = in.nextLine().trim();

        if (choice.equalsIgnoreCase("dog")) {
            System.out.println("DOG ASCII ART HERE");
        } else if (choice.equalsIgnoreCase("cat")) {
            System.out.println("CAT ASCII ART HERE");
        } else {
            System.out.println("Invalid option. Please run again and choose 'dog' or 'cat'.");
        }

        in.close();
    }
}
