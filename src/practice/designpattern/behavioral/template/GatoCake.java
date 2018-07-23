package practice.designpattern.behavioral.template;

public class GatoCake extends CakeTemplate {
    @Override
    protected void nhaoBot() {
        System.out.println("Nhao bot lam banh Gato");
    }

    @Override
    protected void nuongBanh() {
        System.out.println("Nuong banh Gato");
    }

    @Override
    protected void trangTri() {
        System.out.println("Trang tri kem, hoa qua, them chu cho banh Gato");
    }
}
