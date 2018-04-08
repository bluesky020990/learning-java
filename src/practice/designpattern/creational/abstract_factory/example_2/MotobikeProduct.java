package practice.designpattern.creational.abstract_factory.example_2;


import practice.designpattern.creational.abstract_factory.example_2.colorfactory.Color;
import practice.designpattern.creational.abstract_factory.example_2.enginefactory.Engine;

public class MotobikeProduct {

    private Engine engine;
    private Color color;

    public void show(){
        engine.show();
        color.fill();
    }

    public MotobikeProduct(Engine engine, Color color) {
        this.engine = engine;
        this.color = color;
    }
}
