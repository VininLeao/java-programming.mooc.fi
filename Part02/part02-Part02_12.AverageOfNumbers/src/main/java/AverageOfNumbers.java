
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            } else {
                sum = sum + num;
                count = count + 1;
            }
        }
        double average = (double) sum / count;
        System.out.println("Average of the numbers: " + average);
    }
}
