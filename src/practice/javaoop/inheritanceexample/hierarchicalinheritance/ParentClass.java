package practice.javaoop.inheritanceexample.hierarchicalinheritance;

public class ParentClass {
    protected String message;

    public ParentClass(String message) {
        this.message = message;
    }

    public void showMessage(){
        System.out.println("Show message of parent!!");
    }
}
