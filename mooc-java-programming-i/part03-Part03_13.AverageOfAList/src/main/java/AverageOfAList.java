
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> list = new ArrayList<>();
        Integer sum = 0;

        while (true) {

            Integer number = Integer.valueOf(scanner.nextLine());

            if (number != -1) {

                list.add(number);
                sum += number;

            } else {

                break;

            }
        }

        System.out.println("Average " + (1.00 * sum / list.size()));
        
    }
}
