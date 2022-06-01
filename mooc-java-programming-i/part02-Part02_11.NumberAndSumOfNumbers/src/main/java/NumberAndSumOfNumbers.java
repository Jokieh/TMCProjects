
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer numberTimes = 0;
        Integer sum = 0;

        while (true) {

            System.out.println("Give a number:");
            Integer number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {

                break;

            }

            sum = sum + number;
            numberTimes++;

        }

        System.out.println("Number of numbers: " + numberTimes);
        System.out.println("Sum of the numbers: " + sum);


    }
}
