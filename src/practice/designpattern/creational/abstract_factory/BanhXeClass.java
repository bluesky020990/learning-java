package practice.designpattern.creational.abstract_factory;

public class BanhXeClass implements BanhXeInterface {
    private int radius;
    @Override
    public void display() {
        System.out.println("Chiec xe 2 banh voi kich thuoc " + radius + "cm");
    }

    public BanhXeClass(int radius) {
        this.radius = radius;
    }
}
