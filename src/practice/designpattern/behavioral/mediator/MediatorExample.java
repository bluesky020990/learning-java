package practice.designpattern.behavioral.mediator;

import java.util.Arrays;

public class MediatorExample {

    public static void main(String args[]){
        Waiter cana = new Waiter("Cana");
        Cooker moiMoi = new Cooker("Moi Moi");
        Cooker KhanhTran = new Cooker("Khanh Tran");
        Cooker beHuong = new Cooker("Be Huong");
        Cooker cuOc = new Cooker("Cu Oc");

        cana.addCooker(moiMoi);
        cana.addCooker(KhanhTran);
        cana.addCooker(beHuong);
        cana.addCooker(cuOc);

        Client client1 = new Client("Client 1", "Table 04");
        Client client2 = new Client("Client 2", "Table 07");
        Client client3 = new Client("Client 3", "Table 02");

        cana.orderTheFood(client1, Arrays.asList("Oc ca na", "Oc huong nuong moi"));
        cana.orderTheFood(client2, Arrays.asList("Bo nuong la lot", "Thit cho"));
        cana.orderTheFood(client3, Arrays.asList("Ga nguyen con", "Thit heo moi"));
    }
}
