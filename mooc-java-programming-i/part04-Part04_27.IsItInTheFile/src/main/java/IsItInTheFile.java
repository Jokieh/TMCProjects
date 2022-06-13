
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // System.out.println("Name of the file:");
        String file = scanner.nextLine();
        System.out.println();

        List<String > namesList = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                namesList.add(fileScanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

        //System.out.println("Search for:");
        //System.out.println("Enter names, an empty line quits.");
        //while (true) {
            String searchedFor = scanner.nextLine();
        /*    if (searchedFor.isEmpty()) {
                System.out.println();
                System.out.println("Thank you!");
                break;
            }
        */
            if (namesList.contains(searchedFor)) {
                System.out.println("Found");
            } else System.out.println("Not found");
        //}




    }
}
