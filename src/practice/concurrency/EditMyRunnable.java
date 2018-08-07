package practice.concurrency;

public class EditMyRunnable implements Runnable {
    private final Person person;

    public EditMyRunnable(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public void run() {

    }
}
