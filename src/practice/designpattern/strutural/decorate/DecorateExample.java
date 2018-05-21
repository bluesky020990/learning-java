package practice.designpattern.strutural.decorate;

public class DecorateExample {
    public static void main(String args[]){
        Food caHapXiDau = new CaHapXiDau(new BasicFood());
        caHapXiDau.createFood();

        System.out.println("......................................");
        Food caHapXiDauSotCa = new SotMayonnaise(new CaHapXiDau(new BasicFood()));
        caHapXiDauSotCa.createFood();
    }
}
