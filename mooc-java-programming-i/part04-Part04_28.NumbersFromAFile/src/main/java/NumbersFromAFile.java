
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        List<Integer> numbersList = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                Integer number = Integer.valueOf(fileScanner.nextLine());
                if (number >= lowerBound && number <= upperBound) numbersList.add(number);
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }

        System.out.println("Numbers: " + numbersList.size());
    }

}
