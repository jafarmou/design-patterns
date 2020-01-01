package behavioral.template;

public class Basketball extends Game {
    @Override
    void initialize() {
        System.out.println("Basketball game initializing...");
    }

    @Override
    void startPlay() {
        System.out.println("Basketball game starts!");
    }

    @Override
    void endPlay() {
        System.out.println("Basketball game ends!");
    }
}
