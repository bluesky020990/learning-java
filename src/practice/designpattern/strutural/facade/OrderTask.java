package practice.designpattern.strutural.facade;

import java.util.List;

public interface OrderTask {
    void getOrder(List<String> items);
    void deliveryFood(String foood);
    int getBill();
}
