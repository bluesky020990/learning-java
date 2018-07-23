package practice.designpattern.behavioral.strategy;

public class ThuNgan {

    public void pay(Payment method, int money){
        method.pay(money);
    }

}
