package practice.designpattern.strutural.proxy;

import java.util.ArrayList;
import java.util.List;

public class SystemExample {
    private static List<SystemExample> systems;

    private SystemExample remoteSystem;

    static{
        systems = new ArrayList<>();
        SystemExample system1 = new SystemExample("System 1");
        SystemExample system2 = new SystemExample("System 2");
        SystemExample system3 = new SystemExample("System 3");

        systems.add(system1);
        systems.add(system2);
        systems.add(system3);
    }

    private String name ;
    private boolean inprogress;


    public SystemExample(String name) {
        this.name = name;
        this.inprogress = false;
        this.remoteSystem = null;
    }

    public void processRequest(String message){
        if(this.remoteSystem != null){
            this.remoteSystem.processRequest(message);
        } else {
            System.out.println("System " + this.name + " process the request with message " + message);
            this.inprogress = true;
        }
    }

    public boolean isInprogress() {
        return inprogress;
    }

    public static SystemExample getAvailableSystem(){
        for(SystemExample system : systems){
            if(! system.isInprogress()){
                return system;
            }
        }

        return null;
    }

    public SystemExample getRemoteSystem() {
        return remoteSystem;
    }

    public void setRemoteSystem(SystemExample remoteSystem) {
        this.remoteSystem = remoteSystem;
    }
}
