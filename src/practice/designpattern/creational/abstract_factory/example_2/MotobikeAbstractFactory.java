package practice.designpattern.creational.abstract_factory.example_2;

import practice.designpattern.creational.abstract_factory.example_2.colorfactory.Color;
import practice.designpattern.creational.abstract_factory.example_2.enginefactory.Engine;

public abstract class MotobikeAbstractFactory {
    public abstract Color getColorFactory();
    public abstract Engine getEngineFactory();

    public abstract void show();

    public abstract MotobikeProduct createMotobike();
}
