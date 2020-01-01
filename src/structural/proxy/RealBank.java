package structural.proxy;

public class RealBank implements Bank {
    @Override
    public void withdrawMoney(String customerName) throws Exception {
        System.out.println(customerName + " is withdrawing Money");
    }
}
