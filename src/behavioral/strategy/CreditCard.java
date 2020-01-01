package behavioral.strategy;

import java.text.DecimalFormat;

public class CreditCard implements Payment {
    private String name;
    private String cardNumber;

    public CreditCard(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        DecimalFormat formatter = new DecimalFormat("#0.00");
        System.out.println("$" + formatter.format(amount) + " paid with " + this.name + " CreditCard");
    }
}
