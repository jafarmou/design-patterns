package creational.singleton;

public class SingletonSync {
    private static SingletonSync instance;

    private SingletonSync() {
    }

    public static SingletonSync getInstance() {
        if(null == instance) {
            //Adding synchronized method makes the pattern "Thread Safe"
            synchronized (SingletonSimple.class){
                if(null == instance) {
                    instance = new SingletonSync();
                }
            }
        }
        return instance;
    }
}
