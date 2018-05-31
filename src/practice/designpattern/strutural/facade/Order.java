package practice.designpattern.strutural.facade;

import java.util.List;

public class Order implements OrderTask{


    @Override
    public void getOrder(List<String> items) {
        for(String food : items){
            System.out.println("Sent to cooker");
        }
    }

    @Override
    public void deliveryFood(String foood) {
        System.out.println("Sent to client " + foood);
    }

    @Override
    public int getBill() {
        return 100;
    }
}
