
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = "";
        String wholeString = "";

        do {

            inputString = scanner.nextLine();
            wholeString += (inputString + " ");

        } while (!inputString.isEmpty());


        String[] wholeStringArray = wholeString.split(" ");

        for (String word : wholeStringArray) {

            System.out.println(word);

        }
    }
}
