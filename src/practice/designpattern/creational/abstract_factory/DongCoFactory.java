package practice.designpattern.creational.abstract_factory;

public class DongCoFactory {

    public static DongCoInterface getDongCo(int dungTich){
        return new DongCoClass(dungTich);
    }
}
