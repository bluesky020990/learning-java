package practice.designpattern.strutural.decorate;

public class SotMayonnaise extends FoodDecorate {
    public SotMayonnaise(Food food) {
        super(food);
    }

    @Override
    public void createFood() {
        super.createFood();
        System.out.println("Tuoi Sot Mayonaise len nhe !!");
    }
}
