package behavioral.state;

public class HasPin implements ATMState {
    private ATMMachine atmMachine;

    public HasPin(ATMMachine newATMMachine) {
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
        System.out.println("Already entered PIN");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        if(cashToWithdraw > atmMachine.cashInMachine) {
            System.out.println("Don't have that cash!");
            ejectCard();
        } else {
            System.out.println("$" + cashToWithdraw + " is provided by the machine");
            atmMachine.stCashInMachine(atmMachine.cashInMachine - cashToWithdraw);
            ejectCard();

            if(atmMachine.cashInMachine <= 0) {
                atmMachine.setATMState(atmMachine.getNoCashState());
            }
        }
    }
}

