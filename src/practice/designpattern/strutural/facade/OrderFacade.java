package practice.designpattern.strutural.facade;

import java.util.ArrayList;
import java.util.List;

public class OrderFacade {
    public static void helperCustomer(String action){
        OrderTask order = new Order();

        if(action.equals("order")){
            List<String> foods = new ArrayList<>();
            foods.add("Com");
            foods.add("Canh");
            foods.add("Rau");
            order.getOrder(foods);
        } else if(action.equals("bill")){
            order.getBill();
        } else if(action.equals("bring-food")){
            order.deliveryFood("Com");
        }
    }
}
