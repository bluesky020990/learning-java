package practice.designpattern.behavioral.mediator;

import java.util.List;

public interface WaiterMediator {
    void orderTheFood(Client client, List<String>  meals);
    void deliveryMeal(String meal);
}
