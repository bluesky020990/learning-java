package practice.designpattern.creational.abstract_factory.example_2;

import practice.designpattern.creational.abstract_factory.example_2.colorfactory.Color;
import practice.designpattern.creational.abstract_factory.example_2.colorfactory.ColorFactory;
import practice.designpattern.creational.abstract_factory.example_2.enginefactory.Engine;
import practice.designpattern.creational.abstract_factory.example_2.enginefactory.EngineFactory;

public class HybridProducer extends MotobikeAbstractFactory {
    @Override
    public Color getColorFactory() {
        return ColorFactory.getColorByType("red");
    }

    @Override
    public Engine getEngineFactory() {
        return EngineFactory.getEngineByType("hybrid", 160);
    }

    @Override
    public void show() {

    }

    @Override
    public MotobikeProduct createMotobike() {
        Color color = this.getColorFactory();
        Engine engine = this.getEngineFactory();

        return new MotobikeProduct(engine, color);
    }
}
