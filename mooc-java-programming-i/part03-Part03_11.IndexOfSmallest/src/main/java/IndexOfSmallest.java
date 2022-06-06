
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList <Integer> numbersList = new ArrayList<>();

        while (true) {

            Integer currentNumber = Integer.valueOf(scanner.nextLine());

            if (currentNumber == 9999) {

                break;

            }

            numbersList.add(currentNumber);

        }


        int i = 0;
        Integer smallest = numbersList.get(0);


        for (Integer number : numbersList) {

            if (number < smallest) {

                smallest = number;

            }
        }

        System.out.println("Smallest number: " + smallest);


        for (Integer number: numbersList
             ) {

            if (number == smallest) {

                System.out.println("Found at index: " + i);;

            }

            i++;

        }
    }
}
