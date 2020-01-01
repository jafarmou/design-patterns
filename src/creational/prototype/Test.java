package creational.prototype;

public class Test {
    public static void main(String[] args) {
        Person nina = new Person("Nina", 23);
        System.out.println(nina.toString() + nina.hashCode());
        Person james = nina.makeCopy();
        System.out.println(james.toString() + james.hashCode());
    }
}
