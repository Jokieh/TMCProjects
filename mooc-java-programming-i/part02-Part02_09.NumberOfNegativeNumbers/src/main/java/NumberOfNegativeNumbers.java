
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer negativeTimes = 0;

        while (true) {

            System.out.println("Give a number:");
            Integer number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {

                break;

            }

            if (number < 0) {

                negativeTimes++;

            }

        }

        System.out.println("Number of negative numbers: " + negativeTimes);

    }
}
