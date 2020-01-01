package structural.proxy;

public class Test {
    public static void main(String[] args) {
        Bank bank = new ProxyBank();

        try {
            bank.withdrawMoney("James");
            bank.withdrawMoney("Abcd");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
