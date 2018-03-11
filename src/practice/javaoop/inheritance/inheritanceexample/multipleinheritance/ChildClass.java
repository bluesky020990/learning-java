package practice.javaoop.inheritance.inheritanceexample.multipleinheritance;

public class ChildClass  implements InterfaceA, InterfaceB {
    protected String message;
    public ChildClass(String message) {
        this.message = message;
    }


    // The child class will be decided that how does he want to implement the methods
    @Override
    public void showMessage() {
        System.out.println("This is show message, implement by Child Class");
    }

    @Override
    public void displayMessage() {
        System.out.println("This is display message, implement by Child Class");
    }
}
