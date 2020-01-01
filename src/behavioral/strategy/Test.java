package behavioral.strategy;

public class Test {
    public static void main(String[] args) {

        Product pencil = new Product("pencil", 1.20);
        Product notebook = new Product("notebook", 2.50);
        Product pen = new Product("pen", 1.50);

        ShoppingCart james = new ShoppingCart();
        ShoppingCart jenny = new ShoppingCart();

        james.addProduct(pencil);
        james.addProduct(pen);
        james.addProduct(notebook);
        jenny.addProduct(notebook);
        jenny.addProduct(pencil);

        james.pay(new PayPal("James", "james@google.com"));
        jenny.pay(new CreditCard("Jenny", "3434534546"));
    }
}
