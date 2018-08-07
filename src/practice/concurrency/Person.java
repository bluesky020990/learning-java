package practice.concurrency;

public class Person {
    private static Person instance = new Person("Khanh Tran", "Quan 2", 28);
    private static volatile Person volatileInstance = new Person("Moi Moi", "Quan 2", 25);

    private String name;
    private String address;
    private volatile int age;

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


    public Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
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

    public static void setInstance(Person instance) {
        Person.instance = instance;
    }

    public static void setVolatileInstance(Person volatileInstance) {
        Person.volatileInstance = volatileInstance;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void increaseAge(){
        ++age;
    }
}
