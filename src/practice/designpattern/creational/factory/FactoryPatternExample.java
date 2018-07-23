package practice.designpattern.creational.factory;

import practice.designpattern.creational.factory.abstractfactory.ShapeClass;
import practice.designpattern.creational.factory.interfacefactory.FactoryClass;
import practice.designpattern.creational.factory.interfacefactory.ShapeInterface;

public class FactoryPatternExample {
    public static void main(String args[]){
        testFactoryInterface();
        testFactoryAbstract();
        testStaticFactoryAbstract();
    }

    public static void testStaticFactoryAbstract(){
        System.out.println("Factory by static method in Abstract Class");
        ShapeClass circle = practice.designpattern.creational.factory.abstractfactory.FactoryClass.getObectByType("circle");

        circle.draw();
        circle.getArea();
        circle.getPerimeter();

    }


    public static void testFactoryAbstract(){
        System.out.println("Factory by Abstract Class");
        practice.designpattern.creational.factory.abstractfactory.FactoryClass factoryClass = new practice.designpattern.creational.factory.abstractfactory.FactoryClass();

        ShapeClass circle = factoryClass.getShape("circle");

        circle.draw();
        circle.getArea();
        circle.getPerimeter();

        ShapeClass square = factoryClass.getShape("square");
        square.draw();
        square.getArea();
        square.getPerimeter();

        ShapeClass triangle = factoryClass.getShape("triangle");
        triangle.draw();
        triangle.getArea();
        triangle.getPerimeter();
    }

    public static void testFactoryInterface(){
        System.out.println("Factory by Interface Class");

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
