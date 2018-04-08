package practice.designpattern.creational.abstract_factory.example_2.colorfactory;

public class ColorFactory {
    public static Color getColorByType (String color){
        if(color.equals("red")){
            return new RedColor();
        } else {
            return new BlackColor();
        }
    }
}
