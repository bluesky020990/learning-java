package practice.javaoop.abstractinjava;

public class TestAbstractExample {

    public static void main(String args[]){
        AbstractClass abstractClass = new AbstractClass() {
            @Override
            void run() {
                System.out.println("This is override run function");
            }

            @Override
            void eat() {
                System.out.println("This is override eat function");
            }

            @Override
            void sleep() {
                System.out.println("This is override sleep function");
            }

            @Override
            String getCounter(String count) {
                return null;
            }

            @Override
            public void showMessage() {
                super.showMessage();
            }
        };

        abstractClass.run();
        abstractClass.eat();
        abstractClass.sleep();
        abstractClass.showMessage();

        System.out.println("\n\n--------------------------------------------------");

        ImplementClass implementClass = new ImplementClass();
        implementClass.run();
        implementClass.eat();
        implementClass.sleep();
        implementClass.showMessage();
    }
}
