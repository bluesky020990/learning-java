package practice.designpattern.behavioral.visitor;


public class Food implements Item {
    private String name;
    private int prize;

    public Food(String name, int prize) {
        this.name = name;
        this.prize = prize;
    }

    public String getName() {
        return name;
    }

    public int getPrize() {
        return prize;
    }

    @Override
    public int calculator(ItemCalculatorVisitor visitor) {
        return visitor.calculator(this);
    }
}
