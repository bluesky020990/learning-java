package practice.designpattern.creational.abstract_factory.example_2.enginefactory;

public class EcoEngine extends EngineAbstract implements Engine {

    public EcoEngine(int volume) {
        super("default", volume);
    }

    @Override
    public void show() {
        System.out.println("Day la dong co tiet kiem nhien lieu voi dung tich " + this.volume);
    }

    @Override
    public void createEngineer() {

    }
}
