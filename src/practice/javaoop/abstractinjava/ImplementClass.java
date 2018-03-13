package practice.javaoop.abstractinjava;



public class ImplementClass extends AbstractClass {

    @Override
    void run() {
        System.out.println("This is run method implement by class extend");
    }

    @Override
    void eat() {
        System.out.println("This is eat method implement by class extend");
    }

    @Override
    void sleep() {
        System.out.println("This is sleep method implement by class extend");
    }

    @Override
    String getCounter(String count) {
        return null;
    }

    @Override
    public void showMessage() {
        super.showMessage();
    }

    public ImplementClass() {

    }


}
