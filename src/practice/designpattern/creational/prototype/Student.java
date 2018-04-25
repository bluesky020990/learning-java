package practice.designpattern.creational.prototype;

public class Student implements Cloneable {
    private String fullName;
    private Integer age;
    private School school;

    public Student() {
    }

    public static Student getInstance (){
        return new Student("Khanh Tran", 28, new School("THPT Le Thuy", "Le Thuy Quang Binh"));
    }

    public static Student getDeepCloneObject() throws CloneNotSupportedException {
        return (Student) getInstance().clone();
    }

    public static Student getShadowCloneObject(){
        Student result = new Student();
        result.setFullName(getInstance().getFullName());
        result.setAge(getInstance().getAge());
        result.setSchool(getInstance().getSchool());
        return result;
    }

    public Student(String fullName, Integer age, School school) {
        this.fullName = fullName;
        this.age = age;
        this.school = school;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void display (){
        System.out.println("I'm " + this.fullName + ". I'm " + this.age +" years old. I have been learn at " + this.school.getName());
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
