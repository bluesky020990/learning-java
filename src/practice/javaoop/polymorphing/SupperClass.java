package practice.javaoop.polymorphing;

import java.io.IOException;

public class SupperClass {
    protected String message;

    public SupperClass(String message) {
        this.message = message;
    }

    public void display() {
        System.out.println("Welcome to Parent Class");
    }

    private void privateMethod() {
        System.out.println("This is private method of parent class " + message);
    }

    protected void protectedMethod() throws IOException{
        System.out.println("This is protected method of parent class " + message);
    }

    public void publicMethod() throws NullPointerException{
        System.out.println("This is public method of parent class " + message);
    }

    public void methodCanThrowException() throws IOException{
        System.out.println("This is method can throw Exception ");
    }
}
