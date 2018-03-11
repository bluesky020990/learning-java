package practice.javaoop.inheritanceexample;

public class SupperClass implements SupperClassInterface {
    @Override
    public void display() {
        System.out.println("This is display method of supper class");
    }

    @Override
    public void showMessage() {
        System.out.println("This is show message method of supper class");
    }
}
