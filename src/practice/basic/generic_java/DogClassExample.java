package practice.basic.generic_java;

public class DogClassExample {
    private String name;
    private int age;

    public DogClassExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("Dog eats rice and meal!!!");
    }

    public void talk(){
        System.out.println("Gau Gau");
    }

    public void sleep(){
        System.out.println("No, he must be keep safe for my house.");
    }
}
