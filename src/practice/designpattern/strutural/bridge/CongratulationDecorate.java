package practice.designpattern.strutural.bridge;

public class CongratulationDecorate implements Decorate {
    @Override
    public void decorateTheCake() {
        System.out.println("Decorate for congratulation cake ");
    }
}
