package practice.designpattern.strutural.proxy.security;

import practice.designpattern.strutural.proxy.ProxyInterface;
import practice.designpattern.strutural.proxy.SystemExample;

public class SecurityProxy implements ProxyInterface {

    @Override
    public void processRequest(String clientName, String message) {
        try{
            if(clientName.equals("client 3") || clientName.equals("client 1")){
                SystemExample system = SystemExample.getAvailableSystem();
                system.processRequest(message);
            } else {
                throw new Exception("Cannot access the resource !!");
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
