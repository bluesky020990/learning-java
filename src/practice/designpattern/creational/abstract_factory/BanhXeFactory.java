package practice.designpattern.creational.abstract_factory;

public class BanhXeFactory {

    public static BanhXeInterface getBanhXe(int kichThuoc){
        return new BanhXeClass(kichThuoc);
    }
}
