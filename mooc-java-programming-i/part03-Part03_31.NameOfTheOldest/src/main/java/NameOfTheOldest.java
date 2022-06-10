
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer oldest = 0;
        String oldestName = "";

        while (true) {

            String input = scanner.nextLine();

            if (input.isEmpty()) {

                break;

            }

            if (Integer.valueOf(input.split(",")[1]) > oldest) {

                oldest = Integer.valueOf(input.split(",")[1]);
                oldestName = input.split(",")[0];

            }
        }

        System.out.println("Name of the oldest: " + oldestName);




    }
}
