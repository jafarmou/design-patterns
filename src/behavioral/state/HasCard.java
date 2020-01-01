package behavioral.state;

public class HasCard implements ATMState {

    private ATMMachine atmMachine;

    public HasCard(ATMMachine newATMMachine) {
        this.atmMachine = newATMMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You can't insert more than one card!");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected");
        atmMachine.setATMState(atmMachine.getNoCardState());
    }

    @Override
    public void insertPin(int pinEntered) {

        if(pinEntered == 1234) {
            System.out.println("Correct PIN");
            atmMachine.correctPinEntered = true;
            atmMachine.setATMState(atmMachine.getHasPin());
        } else {
            System.out.println("Wrong PIN");
            atmMachine.correctPinEntered = false;
			/*
			System.out.println("Card ejected");
			atmMachine.setATMState(atmMachine.getNoCardState());
			*/
            ejectCard();
        }
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("Enter PIN first");
    }
}

