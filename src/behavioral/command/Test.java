package behavioral.command;

public class Test {
    public static void main(String[] args) {

        SuperMario mario = new SuperMario();
        mario.setName("Mario");
        Kirby kirby = new Kirby();
        kirby.setName("Kirby");

        MarioUpCommand marioUpCommand = new MarioUpCommand(mario);
        MarioDownCommand marioDownCommand = new MarioDownCommand(mario);
        MarioLeftCommand marioLeftCommand = new MarioLeftCommand(mario);
        MarioRightCommand marioRightCommand = new MarioRightCommand(mario);

        KirbyUpCommand kirbyUpCommand = new KirbyUpCommand(kirby);
        KirbyDownCommand kirbyDownCommand = new KirbyDownCommand(kirby);
        KirbyRightCommand kirbyRightCommand = new KirbyRightCommand(kirby);
        KirbyLeftCommand kirbyLeftCommand = new KirbyLeftCommand(kirby);

        GameBoy gameBoyM = new GameBoy(marioUpCommand,marioDownCommand, marioRightCommand, marioLeftCommand);
        GameBoy gameBoyK = new GameBoy(kirbyUpCommand,kirbyDownCommand, kirbyRightCommand, kirbyLeftCommand);

        gameBoyM.arrowRight();
        gameBoyM.arrowUp();

        gameBoyK.arrowUp();
        gameBoyK.arrowDown();
    }
}
