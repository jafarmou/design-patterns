package creational.factory_abstract;

public abstract class Factory {

    protected abstract Device createDevice(String type);

    public Device orderDevice(String type) {
        Device device  = createDevice(type);

        device.prepare();
        device.installSoftware();
        device.box();

        return device;
    }
}
