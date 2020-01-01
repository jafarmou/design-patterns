package behavioral.template;

public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Football game initializing...");
    }

    @Override
    void startPlay() {
        System.out.println("Football game starts!");
    }

    @Override
    void endPlay() {
        System.out.println("Football game ends!");
    }
}
