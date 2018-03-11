package practice.javaoop.inheritanceexample.multilevelinheritance;

public class ParentClass extends GrandParentClass{
    protected String display;

    public ParentClass(String message, String display) {
        super(message);

        this.display = display;
    }

    protected void displayMessage(){
        System.out.println("This is display message of parent class");
    }
}
