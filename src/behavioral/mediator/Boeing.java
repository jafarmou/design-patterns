package behavioral.mediator;

public class Boeing extends Airplane {

    public Boeing(ATCMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + " is sending message: " + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + " received message: " + msg);
    }
}
