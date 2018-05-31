package practice.designpattern.strutural.proxy.virtualproxy;

import practice.designpattern.strutural.proxy.ProxyInterface;
import practice.designpattern.strutural.proxy.SystemExample;

import java.util.ArrayList;
import java.util.List;

public class VirtualProxy implements ProxyInterface {
    public void processRequest(String clientName, String message) {
        SystemExample system = SystemExample.getAvailableSystem();
        try{
            system.processRequest(message);

        } catch (Exception e){
            System.out.println("All system are busy. Please come back after 10 minutes.");
        }
    }


}
