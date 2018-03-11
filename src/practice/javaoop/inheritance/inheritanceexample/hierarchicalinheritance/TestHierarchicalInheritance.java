package practice.javaoop.inheritance.inheritanceexample.hierarchicalinheritance;

public class TestHierarchicalInheritance {
    public static void main (String args[]){
        ChildAClass childClassA = new ChildAClass("Class A");
        ChildBClass childClassB = new ChildBClass("Class B");
        ChildCClass childClassC = new ChildCClass("Class C");


        childClassA.showMessage();
        childClassB.showMessage();
        childClassC.showMessage();
    }
}
