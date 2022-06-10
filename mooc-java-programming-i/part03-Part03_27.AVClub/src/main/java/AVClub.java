
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wholeInput = "";
        String input = "";

        do {

            input = scanner.nextLine();
            wholeInput += input + " ";

        } while (!input.isEmpty());

        for (String word : wholeInput.split("\\s")) {

            if (word.contains("av")) {

                System.out.println(word);

            }

        }

    }
}
