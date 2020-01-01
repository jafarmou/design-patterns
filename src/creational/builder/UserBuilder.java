package creational.builder;

public class UserBuilder {
    private final String firstName;
    private String lastName;
    private int age;
    private String email;

    public UserBuilder(String firstName) {
        this.firstName = firstName;
    }

    public UserBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public User build() {
        return new User(firstName, lastName, age, email);
    }
}
