package practice.designpattern.behavioral.visitor;

public class Drink implements Item {
    private String name;
    private int prize;
    private String size;

    public Drink(String name, int prize, String size) {
        this.name = name;
        this.prize = prize;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getPrize() {
        return prize;
    }

    public String getSize() {
        return size;
    }

    @Override
    public int calculator(ItemCalculatorVisitor visitor) {
        return visitor.calculator(this);
    }
}
