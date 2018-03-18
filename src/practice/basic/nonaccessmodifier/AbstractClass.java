package practice.basic.nonaccessmodifier;

public abstract class AbstractClass {
    abstract void showMessage();

    public static void main(String args[]){
        AbstractClass abstractClass = new AbstractClass() {
            @Override
            void showMessage() {
                System.out.println("This is method of class !!");
            }
        };

        abstractClass.showMessage();
    }
}
