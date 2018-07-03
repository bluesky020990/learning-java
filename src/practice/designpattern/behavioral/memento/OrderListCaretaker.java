package practice.designpattern.behavioral.memento;

public class OrderListCaretaker {

    private Object obj;

    public void save (OrderList orderList){
        this.obj = orderList.save();
    }

    public void undo(OrderList orderList){
        orderList.undoToLastSave(this.obj);
    }

}
