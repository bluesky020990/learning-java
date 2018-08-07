package practice.concurrency.volatiledemo;

import practice.concurrency.EditMyRunnable;
import practice.concurrency.MyRunable;
import practice.concurrency.Person;

public class VolatileExample {
    private final static int TOTAL_THREADS = 2;


    public static void main(String args[]) throws InterruptedException {
//        testVolatile();

        testUnvolatile();
    }

    public static void testVolatile(){
        Person person = Person.getVolatileInstance();

        Runnable task = new MyRunable(person);
        Thread worker = new Thread(task);


        Runnable task2 = new EditMyRunnable(person);
        Thread worker2 = new Thread(task2);

        try{
            worker.sleep(100);

            worker.start();
            worker2.start();

        } catch (Exception e){

        }
    }


    public static void testUnvolatile() throws InterruptedException {
        Person person = Person.getInstance();

        Thread[] threads = new Thread[TOTAL_THREADS];
        for(int i = 0; i < TOTAL_THREADS; ++i){
            threads[i] = new MyRunable(person);
        }

        for(int i = 0; i < TOTAL_THREADS; ++i){
            threads[i].start();
        }


        for(int i = 0; i < TOTAL_THREADS; ++i){
            threads[i].join();
        }
    }
}
