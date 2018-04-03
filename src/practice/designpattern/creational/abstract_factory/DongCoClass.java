package practice.designpattern.creational.abstract_factory;

public class DongCoClass implements DongCoInterface {

    private int dungTich;
    @Override
    public void display() {
        System.out.println("Chiec xe co binh xang lon voi dung tich  " + dungTich + " lit");

    }

    public DongCoClass(int dungTich) {
        this.dungTich = dungTich;
    }
}
