package practice.javaoop.inheritance;

public class Staff extends Person {
    private int staffId;

    public Staff(String name, int staffId) {
        super(name);
        this.staffId = staffId;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public void display (){
        super.display();
        System.out.println("Staff Id is " + staffId);
    }
}
