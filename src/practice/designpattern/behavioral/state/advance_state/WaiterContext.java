package practice.designpattern.behavioral.state.advance_state;

public class WaiterContext implements State {
    private State state;

    public void setState (State state){
        this.state = state;
    }

    @Override
    public void doAction() {
        this.state.doAction();
    }
}
