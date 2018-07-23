package practice.designpattern.behavioral.state.advance_state;

public class WaiterWorkingState implements State {

    @Override
    public void doAction() {
        System.out.println("I'm a waiter. I'm getting the order.");
    }
}
