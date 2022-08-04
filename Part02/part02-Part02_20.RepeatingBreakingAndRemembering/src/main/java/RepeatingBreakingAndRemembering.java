
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int num = Integer.valueOf(scanner.nextLine());

        int sum = 0;
        int count = 0;
        double average = 0.0;
        int evenNumbers = 0;
        int oddNumbers = 0;

        while (num != -1) {
            sum = sum + num;
            count = count + 1;
            if (num % 2 == 0) {
                evenNumbers = evenNumbers + 1;
            } else {
                oddNumbers = oddNumbers + 1;
            }
            num = Integer.valueOf(scanner.nextLine());
        }

        average = (double) sum / count;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even: " + evenNumbers);
        System.out.println("Odd; " + oddNumbers);
    }
}
