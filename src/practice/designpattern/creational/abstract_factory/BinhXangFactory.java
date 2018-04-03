package practice.designpattern.creational.abstract_factory;

public class BinhXangFactory {

    public static BinhXangInterface getBinhXang(int dungTich){
        return new BinhXangClass(dungTich);
    }
}
