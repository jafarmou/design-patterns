package behavioral.command;

public class MarioDownCommand implements Command {
    private final SuperMario mario;

    public MarioDownCommand(SuperMario mario) {
        this.mario = mario;
    }

    @Override
    public void execute() {
        mario.moveDown();
    }
}
