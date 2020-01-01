package creational.prototype;

public class Person implements Animal {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Person makeCopy(){
        Person object = null;
        try {
            object = (Person) super.clone();
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        return object;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
