package practice.designpattern.behavioral.template;

public class BongLanTrungMuoiCake extends CakeTemplate {
    @Override
    protected void nhaoBot() {
        System.out.println("Tron bot lam banh bong lan nao");
    }

    @Override
    protected void nuongBanh() {
        System.out.println("Nuong banh Bong lan");
    }

    @Override
    protected void trangTri() {
        System.out.println("Dem dong hop la xong");
    }
}
