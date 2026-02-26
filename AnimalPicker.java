import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String choice;
        while (true) {
            System.out.print("Which animal would you like to see? (dog/cat): ");
            choice = in.nextLine().trim();
            if (choice.equalsIgnoreCase("dog")) {
                System.out.println("DOG ASCII ART HERE");
                break;
            } else if (choice.equalsIgnoreCase("cat")) {
                System.out.println("CAT ASCII ART HERE");
                break;
            } else {
                System.out.println("Error: invalid option. Please choose 'dog' or 'cat'.");
            }
        }
        in.close();
    }
}
