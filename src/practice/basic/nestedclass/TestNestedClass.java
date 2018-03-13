package practice.basic.nestedclass;

public class TestNestedClass {

    public static void main (String args []){
        NestedClass nestedClass = new NestedClass();
        nestedClass.showMessage();

        System.out.println("\n\n--------------------------------------------------------");

        NestedClass.StaticNestedCLass staticNestedCLass = new NestedClass.StaticNestedCLass();
        staticNestedCLass.showMessage();

        System.out.println("\n\n--------------------------------------------------------");

        NestedClass.NonStaticNestedClass nonStaticInnerClass = new NestedClass().new NonStaticNestedClass();
        nonStaticInnerClass.showMessage();

        System.out.println("\n\n--------------------------------------------------------");
        nestedClass.localClassExample();

        System.out.println("\n\n--------------------------------------------------------");
        nestedClass.localClassExample();
        nestedClass.anonymounsClassExample();
        nestedClass.anonymousClassAbstractExample();

        System.out.println("\n\n--------------------------------------------------------");
        new NestedClass().localClassExample();
        new NestedClass().anonymounsClassExample();
        new NestedClass().anonymousClassAbstractExample();
    }
}
