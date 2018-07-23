package practice.designpattern.behavioral.template;

public class TemplateExample {
    public static void main(String args[]){
        CakeTemplate bongLanTrungMuoi = new BongLanTrungMuoiCake();
        bongLanTrungMuoi.makeACake();

        System.out.println("\n---------------------------------- \n ");
        CakeTemplate banhGato = new GatoCake();
        banhGato.makeACake();
    }
}
