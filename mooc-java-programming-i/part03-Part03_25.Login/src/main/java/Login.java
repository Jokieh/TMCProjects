
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map <String,String> userList = new HashMap<>();

        userList.put("alex", "sunshine");
        userList.put("emma", "haskell");

        System.out.println("Enter username:");
        String username = scanner.nextLine();

        System.out.println("Enter password:");
        String password = scanner.nextLine();

        if (userList.containsKey(username) && userList.get(username).equals(password)) {

            System.out.println("You have successfully logged in!");

        } else {

            System.out.println("Incorrect username or password!");

        }

    }

}
