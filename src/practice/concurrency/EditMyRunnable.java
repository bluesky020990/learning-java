package practice.concurrency;

public class EditMyRunnable implements Runnable {
    private Person person;

    public EditMyRunnable(Person person) {
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

        for(int i = 0; i < 20; i++){
            System.out.println("Update state of person to false !! -------------------- TASK 2");
            if(i == 19){
                person.setActive(false);
            }
        }
    }
}
