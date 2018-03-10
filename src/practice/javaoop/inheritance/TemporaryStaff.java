package practice.javaoop.inheritance;

public class TemporaryStaff extends Staff {

    private int days;
    private int hoursWorked;

    public TemporaryStaff(String name, int staffId, int days, int hoursWorker) {
        super(name, staffId);
        this.days = days;
        this.hoursWorked = hoursWorker;
    }


    public int getSalary(){
        return days * hoursWorked * 90;
    }

    public void display (){
        super.display();
        System.out.println("No. of Days = " + days);
        System.out.println("No. of Hours Worked = " + hoursWorked);
        System.out.println("Total Salary = " + getSalary());
    }

    public static void main (String args[]){
        TemporaryStaff demoClass = new TemporaryStaff("Khanh Tran", 100,22, 8);
        demoClass.display();
    }
}
