package practice.designpattern.behavioral.state.advance_state;

public class StateExample {
    public static void main (String args[]){
        WaiterContext waiterContext = new WaiterContext();

        State waiterWorking = new WaiterWorkingState();
        waiterContext.setState(waiterWorking);

        waiterContext.doAction();


        State cleanerWorking = new CleanerWorkingState();
        waiterContext.setState(cleanerWorking);

        waiterContext.doAction();
    }
}
