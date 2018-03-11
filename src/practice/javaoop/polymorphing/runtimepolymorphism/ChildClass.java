package practice.javaoop.polymorphing.runtimepolymorphism;

public class ChildClass extends ParentClass {
    @Override
    public void showMessage() {
        System.out.println("Show message for child class");
    }

    public void showChildrenMethod (){
        System.out.println("The method belongs Child Class. Parent Class cannot invoker it.");
    }
}
