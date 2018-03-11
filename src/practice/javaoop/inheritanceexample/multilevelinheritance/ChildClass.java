package practice.javaoop.inheritanceexample.multilevelinheritance;

public class ChildClass extends ParentClass {

    protected String warningMessage;

    public ChildClass(String message, String display, String warningMessage) {
        super(message, display);
        this.warningMessage = warningMessage;
    }

    public void showWarningMessage(){
        System.out.println("Show warning message with " + warningMessage + " for child with default message " +
                message + " and display "  + display);
    }
}
