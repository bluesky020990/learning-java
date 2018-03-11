package practice.javaoop.polymorphing;

import java.io.IOException;

public class ChildClass extends SupperClass {
    public ChildClass(String message) {
        super(message);
    }

//    public void display() throws IOException {
//        System.out.println("Welcome to Child class");
//    }

    public void display() throws ArrayIndexOutOfBoundsException {
        System.out.println("Welcome to Child class");
    }

    private void privateMethod()  {
    System.out.println("This is private method of child class " + message);
}

    public void protectedMethod() throws ArrayIndexOutOfBoundsException{
        System.out.println("This is protected method of child class " + message);
    }

    public void publicMethod(){
        System.out.println("This is public method of child class " + message);
    }


    // method override in child cannot throw supper Exception of parent. Exception is parent of IOException.
//    public void methodCanThrowException() throws Exception {
//        System.out.println("This is method of subclass can throw Exception ");
//    }

    public void methodCanThrowException() throws IOException {
        System.out.println("This is method of subclass can throw Exception ");
    }
}
