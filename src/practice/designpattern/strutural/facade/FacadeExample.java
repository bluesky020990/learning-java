package practice.designpattern.strutural.facade;

public class FacadeExample {
    public static void main(String args[]){
        OrderFacade.helperCustomer("order");
        OrderFacade.helperCustomer("bring-food");
        OrderFacade.helperCustomer("bill");
    }
}
