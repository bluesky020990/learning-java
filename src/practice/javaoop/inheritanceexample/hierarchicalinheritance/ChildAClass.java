package practice.javaoop.inheritanceexample.hierarchicalinheritance;

public class ChildAClass extends ParentClass {
    public ChildAClass(String message) {
        super(message);
    }


    public void showMessage(){
        super.showMessage();
        System.out.println("This is show message of " + message);
    }
}
