package practice.designpattern.behavioral.strategy;

public class CreditCardPayment implements Payment {
    private String name;
    private String cardNumber;

    public CreditCardPayment(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int money) {
        System.out.println("Thanh toan so tien " + money + " bang credit card " + cardNumber + " cua " + name);
    }
}
