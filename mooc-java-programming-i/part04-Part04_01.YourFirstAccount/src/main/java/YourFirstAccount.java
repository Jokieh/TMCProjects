
public class YourFirstAccount {

    public static void main(String[] args) {

        Account someAccount = new Account("something", 100.0);

        someAccount.deposit(20.0);
        System.out.println(someAccount);

    }
}
