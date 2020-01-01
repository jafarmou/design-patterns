package creational.factory;

public class AppleFactory {

    private Device createDevice(String type) {
        switch (type.toLowerCase()){
            case "phone":
                return new IPhone();
            case "pc":
                return new MacBook();
            default:
                throw new UnsupportedOperationException("we don't make it!");
        }
    }

    public Device orderDevice(String type) {
        Device device = createDevice(type);

        device.prepare();
        device.installSoftware();
        device.box();

        return device;
    }
}
