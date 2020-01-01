package creational.singleton;

public class Test {
    public static void main(String[] args) {

        SingletonSimple simpleA = SingletonSimple.getInstance();
        SingletonSimple simpleB = SingletonSimple.getInstance();

        System.out.println(simpleA.hashCode() + " vs " +  simpleB.hashCode());

        SingletonSync syncA = SingletonSync.getInstance();
        SingletonSync syncB = SingletonSync.getInstance();

        System.out.println(syncA.hashCode() + " vs " +  syncB.hashCode());

        SingletonEager eagerA = SingletonEager.getInstance();
        SingletonEager eagerB = SingletonEager.getInstance();

        System.out.println(eagerA.hashCode() + " vs " +  eagerB.hashCode());
    }
}
