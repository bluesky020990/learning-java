package practice.javaoop.inheritanceexample.multilevelinheritance;

public class GrandParentClass {
    protected String message;

    public GrandParentClass(String message) {
        this.message = message;
    }

    protected void showMessage(){
        System.out.println("This is show message of grand parent !!");
    }
}
