package practice.designpattern.behavioral.state.basic_state;

public class StateExample {
    public static void main(String args[]){
        Waiter moiMOi = new Waiter("Moi Moi", "waiter");
        moiMOi.work();

        moiMOi.changeState("clean");
        moiMOi.work();
    }
}
