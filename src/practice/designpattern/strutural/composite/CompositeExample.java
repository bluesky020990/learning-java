package practice.designpattern.strutural.composite;

public class CompositeExample {
    public static void main(String args[]) {
        Meal meal = createMeal();
        System.out.println("The meal take  " + meal.takeTime() + " minutes");

        createMealAndShip();
    }

    public static void createMealAndShip() {
        Meal meal = createMeal();
        Ship ship = new Ship(100);
        meal.addTask(ship);
        System.out.println("The meal take  " + meal.takeTime() + " minutes for cook and ship!");
    }

    public static Meal createMeal() {
        Meal meal = new Meal();
        meal.addTask(new Order());
        meal.addTask(new Prepare());
        meal.addTask(new Cook());
        meal.addTask(new BringBack());
        return meal;
    }
}
