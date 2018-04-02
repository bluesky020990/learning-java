package practice.designpattern.creational.factory;

public class CircleClass implements ShapeInterface {
    @Override
    public void draw() {
        System.out.println("This is draw method of circle ");
    }

    @Override
    public void getArea() {
        System.out.println("This is get area method of circle");
    }

    @Override
    public void getPerimeter() {
        System.out.println("This is get perimeter method of circle");
    }
}
