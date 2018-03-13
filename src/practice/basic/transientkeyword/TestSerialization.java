package practice.basic.transientkeyword;

public class TestSerialization {
    public static void main(String args[]) {
        //Path to store the Serialized object
        String filePath = "D://Persist.txt";
        Employee emp = new Employee(1, "Khanh Tran", 1000, "123456");

        System.out.println("Employee id : " + emp.getEmpId());
        System.out.println("Employee Name : " + emp.getEmpName());
        System.out.println("Employee Salary : " + emp.getEmpSalary());
        System.out.println("Employee Password : " + emp.getPassword());

        SerializationExample su = new SerializationExample();

        //Serialize emp object
        su.serialize(emp, filePath);


        System.out.println("This is result after deserialize.");
        //De-Serialize Employee object
        Employee ee = (Employee) su.deSerialize(filePath);
        System.out.println("Employee id : " + ee.getEmpId());
        System.out.println("Employee Name : " + ee.getEmpName());
        System.out.println("Employee Salary : " + ee.getEmpSalary());
        System.out.println("Employee Password : " + ee.getPassword());
    }
}
