

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> numbersList = new ArrayList<>();

        while (true) {

            System.out.println("Give a number");
            Integer number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {

                break;

            }

            numbersList.add(number);


        }

        System.out.println("Average of the numbers: " + (1.0 * numbersList.stream().mapToInt(Integer::intValue).sum() / numbersList.size()));
    }
}
