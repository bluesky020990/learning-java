package practice.javaoop.inheritance;

public class Student extends Person{

    private String clazzName;

    public Student(String name, String clazzName) {
        super(name);
        this.clazzName = clazzName;
    }

    @Override
    public void display() {
        System.out.println("Hi, I'm a student in class " + clazzName);
    }
}
