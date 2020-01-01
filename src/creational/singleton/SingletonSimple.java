package creational.singleton;

public class SingletonSimple {
    private static SingletonSimple instance;

    private SingletonSimple() {
    }

    public static SingletonSimple getInstance() {
        if(null == instance) {
            instance = new SingletonSimple();
        }

        return instance;
    }
}
