package practice.javaoop.inheritance;

public class HybridInheritance extends SupperClazz implements InterfaceA, InterfaceB {

    public HybridInheritance() {

    }

    public void display(){
        System.out.println("This is Hybrid Inheritance object");
    }

    @Override
    public void commonFunction() {
        super.commonFunction();
        System.out.println("This is overwrite function of Hybrid Inheritance object");
    }

    public static void main (String args[]){
        HybridInheritance hybridInheritanceExample = new HybridInheritance();
        hybridInheritanceExample.display();
        hybridInheritanceExample.commonFunction();
    }
}
