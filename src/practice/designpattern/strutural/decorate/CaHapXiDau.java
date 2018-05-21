package practice.designpattern.strutural.decorate;

public class CaHapXiDau extends FoodDecorate {
    public CaHapXiDau(Food food) {
        super(food);
    }

    @Override
    public void createFood() {
        super.createFood();
        System.out.println("Day la ca hap xi dau !!!");
    }
}
