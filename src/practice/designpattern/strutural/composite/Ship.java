package practice.designpattern.strutural.composite;

public class Ship implements Task{
    private int range;

    public Ship(int range) {
        this.range = range;
    }

    @Override
    public int takeTime() {
        return this.range / 10;
    }
}
