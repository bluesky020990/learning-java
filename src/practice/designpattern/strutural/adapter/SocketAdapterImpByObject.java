package practice.designpattern.strutural.adapter;

public class SocketAdapterImpByObject implements SocketAdapter{
    private Socket socket = new Socket();

    @Override
    public Volt get110Volt() {
        return convertVolt(socket.getVolt(), 2);
    }

    @Override
    public Volt get220Volt() {
        return socket.getVolt();
    }

    private Volt convertVolt(Volt v, double scale) {
        return new Volt(v.getVolts() / scale);
    }
}
