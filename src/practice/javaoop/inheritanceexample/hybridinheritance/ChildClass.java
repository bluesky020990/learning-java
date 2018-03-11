package practice.javaoop.inheritanceexample.hybridinheritance;

public class ChildClass extends ParentClass implements InterfaceA, InterfaceB {

    @Override
    public void showMessage() {
        System.out.println("Show message, implemented by children");
    }

    @Override
    public void displayMessage() {
        System.out.println("Display message, implemented by children");
    }
}
