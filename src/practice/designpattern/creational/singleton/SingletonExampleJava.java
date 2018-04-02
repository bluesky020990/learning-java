package practice.designpattern.creational.singleton;

public class SingletonExampleJava {
    private static SingletonExampleJava ourInstance = new SingletonExampleJava();

    public static SingletonExampleJava getInstance() {
        return ourInstance;
    }

    private SingletonExampleJava() {
    }
}
