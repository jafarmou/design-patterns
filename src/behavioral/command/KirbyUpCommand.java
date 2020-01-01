package behavioral.command;

public class KirbyUpCommand implements Command {
    private final Kirby kirby;

    public KirbyUpCommand(Kirby kirby) {
        this.kirby = kirby;
    }

    @Override
    public void execute() {
        kirby.moveUp();
    }
}
