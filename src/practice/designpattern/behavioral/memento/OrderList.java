package practice.designpattern.behavioral.memento;

public class OrderList {
    private String tableName;
    private StringBuilder orderList;

    public OrderList(String tableName) {
        this.tableName = tableName;
        this.orderList = new StringBuilder();
    }

    public String toString(){
        return this.tableName + ": " + this.orderList.toString();
    }

    public void write (String orderItem){
        orderList.append(orderItem);
    }


    public Memento save (){
        return new Memento(this.tableName, this.orderList);
    }

    public void undoToLastSave (Object obj){
        Memento memento = (Memento) obj;
        this.tableName = memento.tableName;
        this.orderList = memento.orderList;
    }

    private class Memento {
        private String tableName;
        private StringBuilder orderList;

        public Memento(String tableName, StringBuilder orderList) {
            this.tableName = tableName;
            this.orderList = new StringBuilder(orderList);
        }
    }
}
