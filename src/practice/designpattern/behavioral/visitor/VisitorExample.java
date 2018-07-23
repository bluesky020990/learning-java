package practice.designpattern.behavioral.visitor;

public class VisitorExample {
    public static void main(String args[]){
        ItemCalculatorVisitor visitor = new ItemCalculatorVisitorImp();

        Item listItem [] = new Item[]{new Food("Thit cho", 200), new Food("Ga quay", 100), new Food("Oc huong", 90)
        , new Drink("Bia Tiger", 20, "S"), new Drink("Tra sua", 20, "M"), new Drink("Coca lit ruoi", 10, "L")};

        int totalCost = 0;
        for(Item item : listItem){
            totalCost += item.calculator(visitor);
        }

        System.out.println("Total : " + totalCost);
    }
}
