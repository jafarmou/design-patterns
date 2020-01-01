package creational.factory;

public class MacBook implements Device {
    @Override
    public void prepare() {
        System.out.println("Collecting MacBook parts ...");
    }

    @Override
    public void installSoftware() {
        System.out.println("Installing macOS ...");
    }

    @Override
    public void box() {
        System.out.println("Boxing MacBook!");
    }
}
