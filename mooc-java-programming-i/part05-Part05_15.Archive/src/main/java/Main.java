
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap <String, String> idNameMap = new HashMap<>();


        while (true) {
            String identifier;
            String name;

            System.out.println("Identivfier? (empty will stop)");
            identifier = scanner.nextLine();
            if (identifier.isEmpty()) break;

            System.out.println("Name? (empty will stop)");
            name = scanner.nextLine();
            if (name.isEmpty()) break;

            if (idNameMap.containsKey(identifier)) continue;
            idNameMap.put(identifier, name);

        }

        for (String element : idNameMap.keySet()) {
            System.out.println(element + ": " + idNameMap.get(element));
        }

    }
}
