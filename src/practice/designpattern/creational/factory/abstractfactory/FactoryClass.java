package practice.designpattern.creational.factory.abstractfactory;


public class FactoryClass {
    public static ShapeClass getObectByType(String type){
        if(type == "square" || type == "rectangle"){
            return new RectangleClass();
        } else if (type == "circle"){
            return new CircleClass();
        }  else {
            return new TriangleClass();
        }
    }


    public ShapeClass getShape(String type){
        if(type == "square" || type == "rectangle"){
            return new RectangleClass();
        } else if (type == "circle"){
            return new CircleClass();
        }  else {
            return new TriangleClass();
        }
    }
}
