package practice.designpattern.creational.abstract_factory;

public class BicycleFactory extends AbstractFactory {

    @Override
    BanhXeInterface getBanhXe() {
        return BanhXeFactory.getBanhXe(100);
    }

    @Override
    BinhXangInterface getBinhXang() {
        return null;
    }

    @Override
    DongCoInterface getDongCo() {
        return null;
    }

    @Override
    MauXeInterface getMauXe() {
        return null;
    }
}
