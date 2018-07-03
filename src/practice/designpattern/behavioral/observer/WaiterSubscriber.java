package practice.designpattern.behavioral.observer;

public class WaiterSubscriber implements Observer {
    private String name;

    public WaiterSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Ok, tao biet roi.");
    }

}
