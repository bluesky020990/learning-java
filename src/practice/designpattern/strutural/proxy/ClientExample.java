package practice.designpattern.strutural.proxy;

public class ClientExample {
    private String name;

    public ClientExample(String name) {
        this.name = name;
    }

    public void sendRequest(String message, ProxyInterface proxy){
        proxy.processRequest(name, message);
    }
}
