package practice.designpattern.creational.abstract_factory.example_2.enginefactory;

public class EngineFactory {
    public static Engine getEngineByType (String type, int volume){
        if(type.equals("eco")){
            return new EcoEngine(volume);
        } else if(type.equals("hybrid")){
            return new HybridEngine(volume);
        } else {
            return new DefaultEngine(volume);
        }
    }
}
