package creational.factory_abstract;

public class Pixel implements Device {
    @Override
    public void prepare() {
        System.out.println("Collecting Pixel parts ...");
    }

    @Override
    public void installSoftware() {
        System.out.println("Installing Android ...");
    }

    @Override
    public void box() {
        System.out.println("Boxing Pixel!");
    }
}
