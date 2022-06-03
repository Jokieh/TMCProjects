
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");
        Integer number = 0;
        Integer sum = 0;
        Integer numberOfNumbers = 0;
        Integer even = 0;
        Integer odd = 0;


        while (true) {

            number = Integer.valueOf(scanner.nextLine());

            if (number != -1) {

                sum = sum + number;

                if ((number % 2) == 1) {

                    odd++;

                } else {

                    even++;

                }

            } else {

                break;

            }

            numberOfNumbers++;


        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numberOfNumbers);
        System.out.println("Average: " + (1.0 * sum / numberOfNumbers));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);




    }
}
