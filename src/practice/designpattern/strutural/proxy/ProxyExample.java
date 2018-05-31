package practice.designpattern.strutural.proxy;


import practice.designpattern.strutural.proxy.remote.RemoveProxy;
import practice.designpattern.strutural.proxy.security.SecurityProxy;
import practice.designpattern.strutural.proxy.virtualproxy.VirtualProxy;

public class ProxyExample {

    public static void main (String arg[]){

        ProxyInterface proxy = getProxyByType("remote");

        ClientExample client = new ClientExample("client 1");
        client.sendRequest("get resource", proxy);
        client.sendRequest("update resource", proxy);
        client.sendRequest("delete resource", proxy);

        ClientExample client2 = new ClientExample("client 2");
        client2.sendRequest("get resource", proxy);
        client2.sendRequest("update resource", proxy);
        client2.sendRequest("delete resource", proxy);

        ClientExample client3 = new ClientExample("client 3");
        client3.sendRequest("get resource", proxy);
        client3.sendRequest("update resource", proxy);
        client3.sendRequest("delete resource", proxy);

        ClientExample client4 = new ClientExample("client 4");
        client4.sendRequest("get resource", proxy);
        client4.sendRequest("update resource", proxy);
        client4.sendRequest("delete resource", proxy);
    }

    private static ProxyInterface getProxyByType (String type){
        if(type.equals("virtual")){
            return new VirtualProxy();
        } else if(type.equals("protected")){
            return new SecurityProxy();
        } else if(type.equals("remote")){
            return new RemoveProxy();
        }

        return null;
    }
}
