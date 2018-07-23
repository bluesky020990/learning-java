package practice.designpattern.behavioral.strategy;

public class BankTransferPayment implements Payment{
    private String account;
    private String reference;

    public BankTransferPayment(String account, String reference) {
        this.account = account;
        this.reference = reference;
    }

    @Override
    public void pay(int money) {
        System.out.println("Thanh toan so tien " + money + " cho tai khoan  " + account + " cho " + reference);
    }
}
