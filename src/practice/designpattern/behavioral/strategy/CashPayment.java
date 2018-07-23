package practice.designpattern.behavioral.strategy;

public class CashPayment implements Payment {

    @Override
    public void pay(int money) {
        System.out.println("Thanh toan so tien " + money + " bang tien mat.");
    }
}
