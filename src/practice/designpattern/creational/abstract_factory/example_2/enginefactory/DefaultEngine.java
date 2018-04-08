package practice.designpattern.creational.abstract_factory.example_2.enginefactory;

public class DefaultEngine extends EngineAbstract implements Engine {
    public DefaultEngine(int volume) {
        super("default", volume);
    }

    @Override
    public void show() {
        System.out.println("Day la dong co thong thuong voi dung tich " + this.volume);
    }

    @Override
    public void createEngineer() {

    }
}
