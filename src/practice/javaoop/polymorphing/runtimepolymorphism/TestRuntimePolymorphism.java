package practice.javaoop.polymorphing.runtimepolymorphism;

public class TestRuntimePolymorphism {
    public static void main(String args[]){
        ParentClass childClass = new ChildClass();
        childClass.showMessage();
        childClass.theChildDontOverrideMethod();



        // error because parent cannot call the method of child.
//        childClass.showChildrenMethod();
    }
}
