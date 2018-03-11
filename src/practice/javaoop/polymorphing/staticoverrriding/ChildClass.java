package practice.javaoop.polymorphing.staticoverrriding;

public class ChildClass extends ParentClass{
    public static void showMessage(){
        System.out.println("This is static method of child!");
    }

    public void showMessage(String message){
        System.out.println("This is overloading method!" + message);
    }
}
