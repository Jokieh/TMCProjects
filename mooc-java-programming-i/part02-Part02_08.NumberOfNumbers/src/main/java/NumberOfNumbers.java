
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer numberTimes = 0;

        while (true) {

            System.out.println("Give a number:");
            Integer number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {

                break;

            }

            numberTimes++;

        }

        System.out.println("Number of numbers: " + numberTimes);

    }
}
