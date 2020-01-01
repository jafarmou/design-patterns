package behavioral.command;

public class MarioUpCommand implements Command {
    private final SuperMario mario;

    public MarioUpCommand(SuperMario mario) {
        this.mario = mario;
    }

    @Override
    public void execute() {
        mario.moveUp();
    }
}
