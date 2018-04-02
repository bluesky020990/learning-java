package practice.designpattern.creational.factory;

public class TriangleClass implements ShapeInterface {

    @Override
    public void draw() {
        System.out.println("This is draw method of triangle");
    }

    @Override
    public void getArea() {
        System.out.println("This is get area method of triangle");
    }

    @Override
    public void getPerimeter() {
        System.out.println("This is get perimeter method of triangle");
    }
}
