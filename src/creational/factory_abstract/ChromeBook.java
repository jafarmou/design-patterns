package creational.factory_abstract;

public class ChromeBook implements Device {
    @Override
    public void prepare() {
        System.out.println("Collecting ChromeBook parts ...");
    }

    @Override
    public void installSoftware() {
        System.out.println("Installing chrome OS ...");
    }

    @Override
    public void box() {
        System.out.println("Boxing ChromeBook!");
    }
}
