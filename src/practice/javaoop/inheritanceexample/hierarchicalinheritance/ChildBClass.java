package practice.javaoop.inheritanceexample.hierarchicalinheritance;

public class ChildBClass extends ParentClass {
    public ChildBClass(String message) {
        super(message);
    }


    public void showMessage(){
        super.showMessage();
        System.out.println("This is show message of class B");
    }
}
