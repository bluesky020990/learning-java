package practice.designpattern.strutural.bridge;

public abstract class Cake {
    private Decorate decorate;
    protected String type;

    public void display(){
        System.out.println(" This is " + this.type + " cake.");
        this.decorate.decorateTheCake();
    }

    public Cake(Decorate decorate) {
        this.decorate = decorate;
    }
}
