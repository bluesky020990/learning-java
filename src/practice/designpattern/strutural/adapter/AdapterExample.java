package practice.designpattern.strutural.adapter;

public class AdapterExample {
    public static void main (String args[]){
        Volt _default = Socket.getVolt();
        Machine machine = new Machine("VN Machine", _default);
        machine.run();

        System.out.println("This is example for class adapter");
        SocketAdapter classAdapter = new SocketAdapterImpByClass();
        showExample(classAdapter);


        System.out.println("This is example for object adapter");
        SocketAdapter objectAdapter = new SocketAdapterImpByObject();
        showExample(objectAdapter);
    }

    public static void showExample(SocketAdapter socketAdapter){
        Machine machine2 = new Machine("JAPAN Machine",  socketAdapter.get110Volt());
        machine2.run();

        Machine machine3 = new Machine("US Machine", socketAdapter.get220Volt());
        machine3.run();
    }
}
