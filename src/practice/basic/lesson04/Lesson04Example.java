package practice.basic.lesson04;

import practice.javaoop.inheritance.Person;

public class Lesson04Example extends Person {

    public Lesson04Example(String name) {
        super(name);
    }



    // age duoc ke thua tu thang person
    public void setAgeForPerson(int age){
        this.age = age;
    }


    public void display(){
        System.out.println("The person has name is " + this.getName() + " and age is " + this.age);
    }


    public static void main (String args[]){
        Lesson04Example example = new Lesson04Example("Khanh Tran");
        example.setAgeForPerson(27);

        example.display();
    }
}
