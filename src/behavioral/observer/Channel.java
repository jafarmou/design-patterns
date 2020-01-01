package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    private String name;
    private List<Observer> observers = new ArrayList<>();
    private String message;

    public Channel(String name) {
        this.name = name;
    }

    @Override
    public void register(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(message));
    }

    public void postMessage(String message) {
        this.message = message;
        System.out.println("Group: " + name + " ----- new message: " + message);
        notifyObservers();
    }
}
