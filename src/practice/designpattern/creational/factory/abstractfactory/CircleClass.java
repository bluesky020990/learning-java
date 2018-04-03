package practice.designpattern.creational.factory.abstractfactory;



public class CircleClass extends ShapeClass {


    protected CircleClass() {

    }

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
