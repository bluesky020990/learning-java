package practice.designpattern.strutural.bridge;

public class BridgeExample {
    public static void main(String args[]){
        Cake birthdayCake = CakeFactory.getCakeForEvent("circle",  "birthday");
        birthdayCake.display();

        Cake congratulateCake = CakeFactory.getCakeForEvent("rectangle", "congratulate");
        congratulateCake.display();
    }
}
