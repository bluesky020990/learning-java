package practice.designpattern.behavioral.observer;

public class ObserverExample {
    public static void main(String args[]){
        // create Food Prepare
        FoodPrepare foodPrepare = new FoodPrepare();

        // create three Waiter
        Observer moiMoi = new WaiterSubscriber("Moi Moi");
        Observer khanhTran = new WaiterSubscriber("Moi Moi");
        Observer noiGian = new WaiterSubscriber("Noi Gian");


        // cho mấy thằng waiter này nó đăng kí thằng food prepare.
        foodPrepare.register(moiMoi);
        foodPrepare.register(khanhTran);
        foodPrepare.register(noiGian);


        foodPrepare.postMessage("Thit cho xong roi");
    }
}
