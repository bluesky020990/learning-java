package practice.designpattern.creational.factory.interfacefactory;

public class FactoryClass {

    public ShapeInterface getShape(String type){
        if(type == "square" || type == "rectangle"){
            return new RectangleClass();
        } else if (type == "circle"){
            return new CircleClass();
        }  else {
            return new TriangleClass();
        }

    }
}
