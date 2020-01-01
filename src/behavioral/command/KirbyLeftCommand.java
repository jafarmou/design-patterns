package behavioral.command;

public class KirbyLeftCommand implements Command {
    private final Kirby kirby;

    public KirbyLeftCommand(Kirby kirby) {
        this.kirby = kirby;
    }

    @Override
    public void execute() {
        kirby.moveLeft();
    }
}
