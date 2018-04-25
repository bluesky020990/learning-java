package practice.designpattern.creational.prototype;

public class PrototypeExample {
    public static void main(String args[]){
        try {
            deepCloneExample();

            System.out.println("--------------------------------------------------------");

            shadowCloneExample();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void deepCloneExample () throws CloneNotSupportedException {
        Student cloneObject = Student.getDeepCloneObject();
        cloneObject.display();

        Student cloneObject2 = Student.getDeepCloneObject();
        cloneObject2.display();

        cloneObject2.getSchool().setName("DHGTVT HCM");
        cloneObject2.getSchool().setAddress("D2 Quan 2 HCM");

        System.out.println("This is result after update !!!");
        cloneObject.display();
        cloneObject2.display();
    }

    private static void shadowCloneExample () throws CloneNotSupportedException {
        Student cloneObject = Student.getShadowCloneObject();
        cloneObject.display();

        Student cloneObject2 = Student.getShadowCloneObject();
        cloneObject2.display();

        cloneObject2.getSchool().setName("DHGTVT HCM");
        cloneObject2.getSchool().setAddress("D2 Quan 2 HCM");

        System.out.println("This is result after update !!!");
        cloneObject.display();
        cloneObject2.display();
    }
}
