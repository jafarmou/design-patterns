package behavioral.observer;

public interface Observer {
    public void update(Object object);
    public void setSubject(Subject subject);
}
