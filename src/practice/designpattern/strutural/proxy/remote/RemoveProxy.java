package practice.designpattern.strutural.proxy.remote;

import practice.designpattern.strutural.proxy.ProxyInterface;
import practice.designpattern.strutural.proxy.SystemExample;

public class RemoveProxy implements ProxyInterface{
    private static SystemExample focusSystem;
    private static SystemExample targetSystem;

    static {
        focusSystem = new SystemExample("focus system");
        targetSystem = new SystemExample("target system");

        focusSystem.setRemoteSystem(targetSystem);
    }

    @Override
    public void processRequest(String clientName, String message) {
        focusSystem.processRequest(message);
    }
}
