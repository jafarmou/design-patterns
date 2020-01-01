package behavioral.strategy;

import java.text.DecimalFormat;

public class PayPal implements Payment {
    private String name;
    private String email;

    public PayPal(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        DecimalFormat formatter = new DecimalFormat("#0.00");
        System.out.println("$" + formatter.format(amount) + " paid with " + this.name + " PayPal");
    }
}
