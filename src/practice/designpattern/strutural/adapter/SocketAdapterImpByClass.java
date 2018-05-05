package practice.designpattern.strutural.adapter;

public class SocketAdapterImpByClass extends Socket implements SocketAdapter {
    @Override
    public Volt get110Volt() {
        return convertVolt(getVolt(), 2);

    }

    @Override
    public Volt get220Volt() {
        return getVolt();
    }

    private Volt convertVolt(Volt v, double scale) {
        return new Volt(v.getVolts() / scale);
    }
}
