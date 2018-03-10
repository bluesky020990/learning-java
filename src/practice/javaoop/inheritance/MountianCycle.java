package practice.javaoop.inheritance;

public class MountianCycle extends Cycle {
    String color;

    public MountianCycle(String color){
        this.color = color;
    }

    public void ride() {
        System.out.println("Number of Gear : \"" + gear + "\"");
        System.out.println("Speed of Cycle : \"" + speed + "\"");
        System.out.println("Color of Cycle : \"" + color + "\"");
    }
}
