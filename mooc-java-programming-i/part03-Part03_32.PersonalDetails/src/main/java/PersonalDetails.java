
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        Integer sum = 0;
        int i = 0;

        while (true) {

            String input = scanner.nextLine();

            if (input.isEmpty()) {

                break;

            }

            i++;
            sum += Integer.valueOf(input.split(",")[1]);

            if (input.split(",")[0].length() > longestName.length()) {

                longestName = input.split(",")[0];

            }
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + 1.0 * sum / i);




    }
}
