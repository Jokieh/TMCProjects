
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        String wholeInput = "";

        List <String[]> list = new ArrayList<>();

        do {

            input = scanner.nextLine();
            if (!input.isEmpty()) {

                list.add(input.split(" "));

            }

        } while (!input.isEmpty());

       for (String[] array : list) {

           System.out.println(array[0]);

       }


    }
}
