package practice.javaoop.inheritance.inheritanceexample.multilevelinheritance;

public class TestMultilevelInheritance {

    public static void main (String args[]){
        ChildClass childClass = new ChildClass("Default Message", "Display Message", "Warning message");

        // he call the function of grand parent class
        childClass.showMessage();

        // he call the function of parent class
        childClass.displayMessage();

        // he call the function of himself.
        childClass.showWarningMessage();
    }
}
