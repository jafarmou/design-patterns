package creational.factory_abstract;

public class GoogleFactory extends Factory{
    @Override
    protected Device createDevice(String type) {
        switch (type.toLowerCase()){
            case "phone":
                return new Pixel();
            case "pc":
                return new ChromeBook();
            default:
                throw new UnsupportedOperationException("we don't make it!");
        }
    }
}
