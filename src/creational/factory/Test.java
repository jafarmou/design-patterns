package creational.factory;

public class Test {
    public static void main(String[] args) {

        AppleFactory appleStore = new AppleFactory();

        appleStore.orderDevice("phone");
        System.out.println();
        appleStore.orderDevice("pc");
    }
}
