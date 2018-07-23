package practice.designpattern.behavioral.state.basic_state;

public class Waiter {
    private String name;
    private String position;

    public Waiter(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void changeState(String position){
        this.position = position;
    }

    public void work(){
        if(this.position.equals("waiter")){
            System.out.println("I'm a waiter. I'm getting the orders.");
        } else if(this.position.equals("clean")){
            System.out.println("I'm a cleaner. I'm washing dishes.");
        }
    }
}
