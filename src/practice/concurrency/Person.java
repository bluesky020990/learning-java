package practice.concurrency;

public class Person {
    private static Person instance = new Person("Khanh Tran", "Quan 2");
    private static volatile Person volatileInstance = new Person("Moi Moi", "Quan 2");

    private String name;
    private String address;
    private boolean active;

    public static Person getInstance (){
        return instance;
    }

    public static Person getVolatileInstance (){
        return volatileInstance;
    }

    public static void changeInstance(String newAddress){
        instance.address = newAddress;
    }

    public static void changeVolatileInstance(String newAddress){
        volatileInstance.address = newAddress;
    }


    public Person(String name, String address) {
        this.name = name;
        this.address = address;
        this.active = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
