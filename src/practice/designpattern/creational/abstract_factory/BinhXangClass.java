package practice.designpattern.creational.abstract_factory;

public class BinhXangClass implements BinhXangInterface {

    private int dungTich;
    @Override
    public void display() {
        System.out.println("Chiec xe co binh xang lon voi dung tich  " + dungTich + " lit");

    }

    public BinhXangClass(int dungTich) {
        this.dungTich = dungTich;
    }
}
