
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number?");
        Integer firstNumber = Integer.valueOf(scanner.nextLine());

        System.out.println("Last number?");
        Integer lastNumber = Integer.valueOf(scanner.nextLine());

        Integer sum = 0;

        for (int i = firstNumber; i <= lastNumber; i++) {

            sum = sum + i;

        }

        System.out.println("The sum is " + sum);

    }
}
