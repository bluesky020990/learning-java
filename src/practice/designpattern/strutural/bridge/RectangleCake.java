package practice.designpattern.strutural.bridge;

public class RectangleCake extends Cake {
    public RectangleCake(Decorate decorate) {
        super(decorate);
        this.type = "rectangle";
    }
}
