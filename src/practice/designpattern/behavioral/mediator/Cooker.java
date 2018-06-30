package practice.designpattern.behavioral.mediator;

public class Cooker {
    private String name;
    private Waiter waiter;
    int totalFood;

    public Cooker(String name) {
        this.name = name;
        this.totalFood = 0;
    }

    public boolean isBusy() {
        if(totalFood > 4){
            return true;
        }
        return false;
    }

    public void makeTheMeals(String meals, Waiter waiter) {
        this.waiter = waiter;
        this.sendTheMeals(meals);
        this.totalFood ++;
    }

    public void sendTheMeals(String meal){
        System.out.println(this.name + " is cooking " + meal);
        waiter.deliveryMeal(meal);
    }
}
