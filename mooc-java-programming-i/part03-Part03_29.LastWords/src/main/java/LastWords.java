
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";


        List<String[]> list = new ArrayList<>();

        do {

            input = scanner.nextLine();
            if (!input.isEmpty()) {

                list.add(input.split(" "));

            }

        } while (!input.isEmpty());

        for (String[] array : list) {

            System.out.println(array[array.length-1]);

        }

    }
}
