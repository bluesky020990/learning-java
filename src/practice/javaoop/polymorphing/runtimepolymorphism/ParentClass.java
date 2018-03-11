package practice.javaoop.polymorphing.runtimepolymorphism;

public class ParentClass {
    public void showMessage(){
        System.out.println("Show message for parent!!!");
    }

    public void theChildDontOverrideMethod(){
        System.out.println("Call parent method because children dont override this method!!!");
    }
}
