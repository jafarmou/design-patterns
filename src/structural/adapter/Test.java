package structural.adapter;

public class Test {
    public static void main(String[] args) {
        Orange orange = new BloodOrange();
        Apple apple = new AppleAdapter(orange);

        System.out.println(apple.getVariety());
        System.out.println();
        apple.eat();
    }
}
