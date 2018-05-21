package practice.designpattern.strutural.decorate;

public class BasicFood implements Food {

    @Override
    public void createFood() {
        System.out.println("This is default food.");
    }
}
