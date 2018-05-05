package practice.designpattern.strutural.adapter;

public class Socket {
    public static Volt getVolt(){
        return new Volt(220);
    }
}
