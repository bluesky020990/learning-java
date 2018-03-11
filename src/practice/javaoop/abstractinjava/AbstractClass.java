package practice.javaoop.abstractinjava;

public abstract class AbstractClass {
    abstract void run();

    abstract void eat();

    abstract void sleep();

    abstract int getCounter(int count);

    // cannot implement the function.
//    abstract String getCounter(int count);

    abstract String getCounter(String count);

    public AbstractClass() {
        System.out.println("This is constructor of abstract class");
    }

    public void showMessage(){
        System.out.println("Show warning message !!!");
    }
}
