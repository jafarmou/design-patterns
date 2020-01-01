package creational.factory_abstract;

public class IPhone implements Device {
    @Override
    public void prepare() {
        System.out.println("Collecting iPhone parts ...");
    }

    @Override
    public void installSoftware() {
        System.out.println("Installing iOS ...");
    }

    @Override
    public void box() {
        System.out.println("Boxing iPhone!");
    }
}
