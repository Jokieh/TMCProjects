
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = new ArrayList<>();

        while (true) {



            Integer number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {

                break;

            } else if (number > 0) {

                numbersList.add(number);

            }


        }

        if (numbersList.size() == 0) {

            System.out.println("Cannot calculate the average");

        } else {

            System.out.println(1.0 * numbersList.stream().mapToInt(Integer::intValue).sum() / numbersList.size());

        }

    }
}
