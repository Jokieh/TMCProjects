
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println();
        Integer number = Integer.valueOf(scan.nextLine());

        Integer mod = Math.abs(number % 2);

        if (mod == 1) {

            System.out.println("Number " + number + " is odd.");

        } else {

            System.out.println("Number " + number + " is even.");

        }

    }
}
