package practice.javaoop.inheritance;

public class MultipleInheritance implements InterfaceA, InterfaceB{

    @Override
    public void commonFunction() {
        System.out.println("The child will decide what will he do in there");
    }

    public static void main (String args[]){
        MultipleInheritance demoClass = new MultipleInheritance();
        demoClass.commonFunction();
    }
}
