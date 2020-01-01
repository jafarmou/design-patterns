package behavioral.command;

public class KirbyDownCommand implements Command {
    private final Kirby kirby;

    public KirbyDownCommand(Kirby kirby) {
        this.kirby = kirby;
    }

    @Override
    public void execute() {
        kirby.moveDown();
    }
}
