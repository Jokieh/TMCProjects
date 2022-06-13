
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                String name = row.split(",")[0];
                Integer age = Integer.valueOf(row.split(",")[1]);
                System.out.print(name + ", age: " + age + " year");
                if (age > 1 || age == 0) System.out.print("s");
                System.out.println();
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }

    }
}
