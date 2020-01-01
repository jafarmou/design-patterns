package behavioral.observer;

public class Subscriber implements Observer {
    private String name;
    private String message;
    private Subject topic;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(Object object) {
        this.message = object.toString();
        System.out.println(name + " received Message: " + message);
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}
