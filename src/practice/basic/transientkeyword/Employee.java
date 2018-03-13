package practice.basic.transientkeyword;

import java.io.Serializable;

public class Employee implements Serializable{
    private int empId;
    private String empName;
    private int empSalary;
    private transient String password;

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public String getPassword() {
        return password;
    }

    public Employee(int empId, String empName, int empSalary, String password) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.password = password;
    }
}
