package practice.object_reference;
/*
*
*
* */
public class ObjectReference {
    public static void main(String[] args) {
        swapTwoObjectAndShowResult();

//        checkUpdateStudentInfo();
//        checkUpdateStudentInfoByCreateNewStudent();
    }

    public static void swapTwoObjectAndShowResult(){
        Color redColor = new Color("red");
        Color greenColor = new Color("green");

        swapTwoObject(redColor, greenColor);

        System.out.println("What we want: ");
        System.out.println("Red color is green");
        System.out.println("Green color is red");


        System.out.println("And result is: ");
        System.out.println("Red color is " + redColor.getColor());
        System.out.println("Green color is " + greenColor.getColor());

        // result is :
        // Red color is red
        // Green color isgreen
    }

    public static void swapTwoObject(Color objectA, Color objectB){
        Color objectC = objectB;
        objectB = objectA;
        objectA = objectC;
    }


    public static void changeStudentNameWithoutReallocation(Student student) {
        student.setName("New name");
    }

    public static void changeStudentNameWithReallocation(Student student) {
        student = new Student();
        student.setName("New name");
    }


    public static void checkUpdateStudentInfo(){
        Student student1 = new Student();
        student1.setName("Current name");
        changeStudentNameWithoutReallocation(student1);
        System.out.println("Student 1 name : " + student1.getName());
    }

    public static void checkUpdateStudentInfoByCreateNewStudent(){
        Student student2 = new Student();
        student2.setName("Current name");
        changeStudentNameWithReallocation(student2);
        System.out.println("Student 2 name : " + student2.getName());
    }
}
