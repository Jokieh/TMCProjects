
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer number1 = Integer.valueOf(scanner.nextLine());
        Integer number2 = Integer.valueOf(scanner.nextLine());

        System.out.println(Math.sqrt(number1 + number2));
    }
}
