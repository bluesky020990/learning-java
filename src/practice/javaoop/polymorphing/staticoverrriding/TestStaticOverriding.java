package practice.javaoop.polymorphing.staticoverrriding;

public class TestStaticOverriding {
    public static void main(String args[]){
        testShowOverloadStaticMethod();
        testShowOverrideStaticMethod();
    }

    public static void testShowOverloadStaticMethod(){
        System.out.println("Test overload static and non static function");

        ChildClass child = new ChildClass();
        child.showMessage();
        child.showMessage("Non static method");
    }

    public static void testShowOverrideStaticMethod(){
        System.out.println("Test override static and non static function");

        ParentClass parentClass = new ParentClass();
        parentClass.showMessage();

        ChildClass child = new ChildClass();
        child.showMessage();

        ParentClass fakeClass = new ChildClass();
        fakeClass.showMessage();
    }
}
