package behavioral.state;

public class NoCash implements ATMState {

    private ATMMachine atmMachine;

    public NoCash(ATMMachine newATMMachine) {
        this.atmMachine = newATMMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("We don't have Money");
    }

    @Override
    public void ejectCard() {
        System.out.println("We don't have Money");
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("We don't have Money");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("We don't have Money");
    }
}

