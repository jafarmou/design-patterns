package behavioral.command;

public class KirbyRightCommand implements Command {
    private final Kirby kirby;

    public KirbyRightCommand(Kirby kirby) {
        this.kirby = kirby;
    }

    @Override
    public void execute() {
        kirby.moveRight();
    }
}
