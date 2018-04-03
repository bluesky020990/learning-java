package practice.designpattern.creational.abstract_factory;

public class MauXeFactory {

    public static MauXeInterface getMauXe (String color){
        return new MauXeClass(color);
    }
}
