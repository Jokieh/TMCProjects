
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Give the first number:");
        Integer first = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        Integer second = Integer.valueOf(scanner.nextLine());

        Integer additionResult = first + second;
        System.out.println(first + " + " + second + " = " + additionResult);

        Integer subtractionResult = first - second;
        System.out.println(first + " - " + second + " = " + subtractionResult);

        Integer multiplicationResult = first * second;
        System.out.println(first + " * " + second + " = " + multiplicationResult);

        Double divisionResult = 1.0 * first / second;
        System.out.println(first + " / " + second + " = " + divisionResult);

    }
}
