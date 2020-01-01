package behavioral.command;

public class MarioLeftCommand implements Command {
    private final SuperMario mario;

    public MarioLeftCommand(SuperMario mario) {
        this.mario = mario;
    }

    @Override
    public void execute() {
        mario.moveLeft();
    }
}
