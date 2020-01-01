package creational.builder;

public class Test {
    public static void main(String[] args) {
        User James = new UserBuilder("James")
            .setLastName("Bond")
            .setAge(44)
            .build();

        System.out.println(James);
    }
}