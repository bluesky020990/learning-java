package practice.designpattern.creational.abstract_factory.example_2.colorfactory;

public class BlackColor implements Color {
    @Override
    public void fill() {
        System.out.println("Son xe mau đen cho cá tính nhé!!!");
    }
}
