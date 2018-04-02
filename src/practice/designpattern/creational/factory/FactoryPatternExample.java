package practice.designpattern.creational.factory;

public class FactoryPatternExample {
    public static void main(String args[]){
        FactoryClass factory = new FactoryClass();

        ShapeInterface circle = factory.getShape("circle");
        ShapeInterface square = factory.getShape("square");
        ShapeInterface triangle = factory.getShape("triangle");


        circle.draw();
        circle.getArea();
        circle.getPerimeter();

        square.draw();
        square.getArea();
        square.getPerimeter();

        triangle.draw();
        triangle.getArea();
        triangle.getPerimeter();
    }
}
