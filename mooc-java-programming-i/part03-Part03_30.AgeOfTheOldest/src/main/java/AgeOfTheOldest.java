
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer oldest = 0;

        while (true) {

            String input = scanner.nextLine();

            if (input.isEmpty()) {

                break;

            }

            if (Integer.valueOf(input.split(",")[1]) > oldest) {

                oldest = Integer.valueOf(input.split(",")[1]);

            }
        }

        System.out.println("Age of the oldest: " + oldest);


    }
}
