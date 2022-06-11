public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public void eatAffordably () {
        if (balance - 2.60 < 0 ) {} else {
            balance -= 2.60;
        }
    }

    public void eatHeartily () {
        if (balance - 4.60 < 0 ) {} else {
            balance -= 4.60;
        }
    }

    public void addMoney (double money) {
        if (money > 0) {
            balance += money;
            if (balance > 150 ) {
                balance = 150;
            }

        }
    }

    public String toString () {
        return "The card has a balance of " + balance + " euros";
    }


}
