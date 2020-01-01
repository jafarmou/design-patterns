package creational.factory_abstract;

public class AppleFactory extends Factory{
    @Override
    protected Device createDevice(String type) {
        switch (type.toLowerCase()){
            case "phone":
                return new IPhone();
            case "pc":
                return new MacBook();
            default:
                throw new UnsupportedOperationException("we don't make it!");
        }
    }
}
