package practice.concurrency;

public class MyRunable implements Runnable {
    private Person person;

    public MyRunable(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public void run() {
        boolean isActive = person.isActive();
        for(int i = 0; i < 100; i++){
            System.out.println("current state of person is  " + (isActive ? "TRUE" : "FALSE ") + "............................. TASK 1 ");
        }
    }
}
