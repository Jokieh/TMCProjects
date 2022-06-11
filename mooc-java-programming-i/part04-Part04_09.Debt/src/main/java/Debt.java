public class Debt {
    private double balance;
    private double interestRate;

    public Debt(double initialBalance, double initialInterestrate) {
        this.balance = initialBalance;
        this.interestRate = initialInterestrate;
    }

    public void printBalance () {
        System.out.println(balance);
    }

    public void waitOneYear () {
    balance  *= interestRate;
    }
}
