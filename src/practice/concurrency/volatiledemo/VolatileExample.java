package practice.concurrency.volatiledemo;

import practice.concurrency.EditMyRunnable;
import practice.concurrency.MyRunable;
import practice.concurrency.Person;

public class VolatileExample {
    public static void main(String args[]){
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
            Thread.sleep(100);

            worker.start();
            worker2.start();

        } catch (Exception e){

        }
    }

    public static void testUnvolatile(){
        Person person = Person.getInstance();

        Runnable task = new MyRunable(person);
        Thread worker = new Thread(task);


        Runnable task2 = new EditMyRunnable(person);
        Thread worker2 = new Thread(task2);

        try{
            worker.sleep(100);
            worker2.sleep(100);

            worker.start();
            worker2.start();

        } catch (Exception e){

        }
    }
}
