package practice.javaoop.inheritance;

public class Worker extends Person {
    private String company;

    public Worker(String name, String company) {
        super(name);
        this.company = company;
    }

    public void display(){
        System.out.println("I'm working in company " + company);
    }
}
