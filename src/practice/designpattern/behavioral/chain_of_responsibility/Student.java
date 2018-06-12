package practice.designpattern.behavioral.chain_of_responsibility;

public class Student {
    String name;
    Student nextStudent;

    public Student(String name) {
        this.name = name;
    }

    public void setNextStudent(Student nextStudent){
        this.nextStudent = nextStudent;
    }

    public Student getNextStudent(){
        return this.nextStudent;
    }

    public String getName() {
        return name;
    }

    public void process(String studentName){
        if(this.name.equals(studentName)){
            System.out.println("I have been receive your email.");
        } else{
            System.out.println("This is not my email. I will send it for " + this.getNextStudent().getName());
            this.getNextStudent().process(studentName);
        }
    }
}
