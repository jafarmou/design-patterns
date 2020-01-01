package behavioral.command;

public class MarioRightCommand implements Command {
    private final SuperMario mario;

    public MarioRightCommand(SuperMario mario) {
        this.mario = mario;
    }

    @Override
    public void execute() {
        mario.moveRight();
    }
}
