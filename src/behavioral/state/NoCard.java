package behavioral.state;

public class NoCard implements ATMState {

    private ATMMachine atmMachine;

    public NoCard(ATMMachine newATMMachine) {
        this.atmMachine = newATMMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Please Enter a PIN");
        atmMachine.setATMState(atmMachine.getYesCardState());
    }

    @Override
    public void ejectCard() {
        System.out.println("Insert a Card first");
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("Insert a Card first");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("Insert a Card first");
    }
}

