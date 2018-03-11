package practice.javaoop.abstractinjava;

public class ClassImplementInterface implements ChildAInterface, ChidBInterface {

    @Override
    public void display() {
        System.out.println("display function !");
    }

    @Override
    public void showMessage() {
        System.out.println("show message function !");
    }

    @Override
    public void showDefaultMessage() {
        System.out.println("show default message function !");
    }

//    @Override
//    public String getCounter() {
//        return "Message";
//    }
//
//    @Override
//    public int getCounter() {
//        return 100;
//    }


    @Override
    public void displayMessageByParame(String param) {
        param = "ABCDEF";

        System.out.println("Show message by parameters " + param);
    }
}
