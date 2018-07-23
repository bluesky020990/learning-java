package practice.designpattern.behavioral.state.advance_state;

public class CleanerWorkingState implements State {

    @Override
    public void doAction() {
        System.out.println("I'm cleaner. I'm washing dishes.");
    }
}
