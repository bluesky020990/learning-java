package practice.javaoop.inheritance.inheritanceexample.singleinheritance;

public class SuperClass {

    protected String message;

    public SuperClass(String message) {
        this.message = message;
    }

    public void showMessage (){
        System.out.println("This is method of parent!");
    }
}
