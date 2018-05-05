package practice.designpattern.strutural.adapter;

public class Machine {
    private String name;
    private Volt volt;


    public Machine(String name, Volt volt) {
        this.name = name;
        this.volt = volt;
    }

    public Volt getVolt() {
        return volt;
    }

    public void setVolt(Volt volt) {
        this.volt = volt;
    }

    public void run(){
        System.out.println("I'm " + this.name + ". I'm running with " + volt.getVolts() + " Volts");
    }
}
