package practice.designpattern.behavioral.memento;

public class MenentoExample {
    public static void main(String args[]){
        OrderListCaretaker takeCare = new OrderListCaretaker();

        OrderList orderList = new OrderList("Table 10");
        orderList.write("Thit cho cham mam tom");
        orderList.write("Ga hap hanh");


        takeCare.save(orderList);

        orderList.write("Bo xao chua ngot");

        System.out.println(orderList.toString());

        takeCare.undo(orderList);
        orderList.write("Bo xao cai thia");

        System.out.println(orderList.toString());
    }
}
