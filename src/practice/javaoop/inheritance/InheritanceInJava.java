package practice.javaoop.inheritance;

public class InheritanceInJava {
    public static void main(String args[]) {
        //Create object of the Sub Class(MountianCycle)
        MountianCycle mb = new MountianCycle("Blue");
        //Set the values to the Cycle class attributes through MountianCycle object
        mb.speed = "50kmh";
        mb.gear = 5;
        mb.ride();
    }
}
