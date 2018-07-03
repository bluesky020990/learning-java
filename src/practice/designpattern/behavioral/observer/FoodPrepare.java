package practice.designpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class FoodPrepare implements Subject {
    private List<Observer> observers;

    public FoodPrepare() {
        this.observers = new ArrayList<>();
    }

    public void register(Observer obj) {
        if(obj == null) throw new NullPointerException("Null Observer");
        if(!observers.contains(obj)) observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        for (Observer obj : observers) {
            obj.update();
        }
    }

    public void postMessage(String msg) {
        System.out.println(msg);

        notifyObservers();
    }
}
