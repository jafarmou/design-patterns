package creational.factory_abstract;

public class Test {
    public static void main(String[] args) {

        Factory appleStore = new AppleFactory();
        Factory googleStore = new GoogleFactory();
        appleStore.orderDevice("phone");
        System.out.println();
        appleStore.orderDevice("pc");
        System.out.println();
        googleStore.orderDevice("pc");
    }
}
