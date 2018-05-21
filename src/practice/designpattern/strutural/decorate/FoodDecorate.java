package practice.designpattern.strutural.decorate;

public class FoodDecorate implements Food {

    protected Food food;

    public FoodDecorate(Food food) {
        this.food = food;
    }

    @Override
    public void createFood() {
        food.createFood();
    }
}
