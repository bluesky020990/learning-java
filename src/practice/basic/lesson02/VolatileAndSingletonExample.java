package practice.basic.lesson02;


public class VolatileAndSingletonExample {
    private volatile static int COUNTER = 0;

    public static void main(String[] args) {
        new ChangeListener().start();
        new ChangeMaker().start();
    }

    // this function listener the change of single ton
    static class ChangeListener extends Thread {
        @Override
        public void run() {
            while(! Singleton.isSingleTonIsCreated){
                System.out.println("Listener: Double check singleton is not created"  + " with " + COUNTER);
            }
        }
    }


    // this function create the single ton.
    static class ChangeMaker extends Thread {
        @Override
        public void run() {
            while(COUNTER < 5){
                COUNTER++;

                if(COUNTER == 3){
                    Singleton singleton = createDoubleCheckSingletonByCallGetInstanceMethod();
                    String message = singleton != null ? "Maker Message: Singleton has been created." :
                            "Maker Message: Singleton isn't created";
                    System.out.println(message);
                }

                try {
                    System.out.println(".........................." + COUNTER);
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    static Singleton createDoubleCheckSingletonByCallGetInstanceMethod(){
        return Singleton.getDoubleCheckSynchronizedSingleton();
    }
}
