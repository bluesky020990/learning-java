package practice.designpattern.creational.factory;

public class RectangleClass implements ShapeInterface {
    @Override
    public void draw() {
        System.out.println("This is draw method of Rectangle ");
    }

    @Override
    public void getArea() {
        System.out.println("This is get area method of Rectangle");
    }

    @Override
    public void getPerimeter() {
        System.out.println("This is get perimeter method of Rectangle");
    }
}
