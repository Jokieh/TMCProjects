
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("Search for? ");
        Integer search = Integer.valueOf(scanner.nextLine());
        int i = 0;

        for (Integer number : list) {

            if (number == search) {

                System.out.println(search + " is at index " + i);

            }

            i++;

        }




        // implement here finding the indices of a number
    }
}
