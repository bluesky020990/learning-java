package practice.basic.generic_java;

public class CatClassExample {
    private String name;
    private int age;

    public CatClassExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("Cat cannot catch any mouse, so, he eats meal or fish.");
    }

    public void talk(){
        System.out.println("Meo Meo");
    }

    public void sleep(){
        System.out.println("23.9/24 hours of each day.");
    }
}
