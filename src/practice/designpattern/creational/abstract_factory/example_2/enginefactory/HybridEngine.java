package practice.designpattern.creational.abstract_factory.example_2.enginefactory;

public class HybridEngine extends EngineAbstract implements Engine {
    public HybridEngine(int volume) {
        super("hybrid", volume);
    }

    @Override
    public void show() {
        System.out.println("Day la dong co Hybrid chay bang dien voi dung tich cua binh ac quy" + this.volume + "");
    }

    @Override
    public void createEngineer() {

    }
}
