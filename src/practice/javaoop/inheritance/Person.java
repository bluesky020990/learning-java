package practice.javaoop.inheritance;

public class Person {
    private String name;

    protected int age;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println("Name of person = " + name);
    }
}
