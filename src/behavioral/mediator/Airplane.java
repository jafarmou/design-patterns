package behavioral.mediator;

public abstract class Airplane {
    protected String name;
    protected ATCMediator mediator;

    public Airplane(ATCMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void send(String msg);
    public abstract void receive(String msg);
}
