package practice.designpattern.strutural.bridge;

public class TriangleCake extends Cake {
    public TriangleCake(Decorate decorate) {
        super(decorate);
        this.type = "triangle";
    }

}
