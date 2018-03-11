package practice.javaoop.polymorphing;


import java.io.IOException;

public class PolymorphingInJava {

    public static void main (String args[]){

        ChildClass childClass = new ChildClass("Message display");

        childClass.protectedMethod();
        childClass.publicMethod();

        try {
            childClass.methodCanThrowException();
        } catch (IOException e) {

        }
    }
}
