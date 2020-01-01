package behavioral.template;

public class Test {
    public static void main(String[] args) {
        Game football = new Football();
        football.play();

        System.out.println();
        Game basketball = new Basketball();
        basketball.play();
    }
}
