
import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a string");
        String input = reader.nextLine();

        if (input.equals("a string")) {
            System.out.println("Great! You read the instructions correctly.");
        } else {
            System.out.println("Missed the mark!");
        }
    }
}
