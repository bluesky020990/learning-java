package practice.javaoop.inheritance;

public class HierarchicalInheritance {

    public static void main (String args []){
        Student noiGian = new Student("Noi Gian", "nhong nheo");
        Worker khanhTran = new Worker("Khanh Tran", "Ban Vien");
        Staff moiMoi = new Staff("Moi Moi", 12345);

        noiGian.display();
        khanhTran.display();
        moiMoi.display();

    }
}
