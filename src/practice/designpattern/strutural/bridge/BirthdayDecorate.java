package practice.designpattern.strutural.bridge;

public class BirthdayDecorate implements Decorate {
    @Override
    public void decorateTheCake() {
        System.out.println("Decorate for birthday cake ");
    }
}
