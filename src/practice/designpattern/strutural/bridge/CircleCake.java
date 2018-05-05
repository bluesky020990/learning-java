package practice.designpattern.strutural.bridge;

public class CircleCake extends Cake {
    public CircleCake(Decorate decorate) {
        super(decorate);
        this.type = "circle";
    }
}
