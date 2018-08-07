package practice.concurrency;

public class MyRunable extends  Thread {
    private final Person person;

    public MyRunable(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }


    @Override
    public void run() {
        int currentValue = person.getAge();

        System.out.println("Thread " + Thread.currentThread().getId() + " - old value :  " + currentValue);

        person.increaseAge();

        int newValue = person.getAge();
        System.out.println("Thread " + Thread.currentThread().getId() + " - new value :  " + newValue);
    }
}
