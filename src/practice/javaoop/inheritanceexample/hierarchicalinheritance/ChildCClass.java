package practice.javaoop.inheritanceexample.hierarchicalinheritance;

public class ChildCClass extends ParentClass{
    public ChildCClass(String message) {
        super(message);
    }

    public void showMessage(){
        super.showMessage();
        System.out.println("This is show message of " + message);
    }
}
