package practice.designpattern.creational.abstract_factory;

public class MauXeClass implements  MauXeInterface{

    private String color;
    @Override
    public void display() {
        System.out.println("Chiec xe duoc son mau   " + color);
    }

    public MauXeClass(String color) {
        this.color = color;
    }
}
