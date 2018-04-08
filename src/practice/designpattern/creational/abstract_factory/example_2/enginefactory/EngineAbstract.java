package practice.designpattern.creational.abstract_factory.example_2.enginefactory;

public abstract class EngineAbstract {
    protected String type;
    protected int volume;

    public EngineAbstract(String type, int volume) {
        this.type = type;
        this.volume = volume;
    }
}
