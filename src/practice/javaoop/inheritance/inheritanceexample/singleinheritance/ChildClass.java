package practice.javaoop.inheritance.inheritanceexample.singleinheritance;

public class ChildClass extends SuperClass {

    public ChildClass(String message) {
        super(message);
    }

    // the child class will using all method of parent class.

    // He doesn't have to implement show message method, because he can get it from parent.

}
