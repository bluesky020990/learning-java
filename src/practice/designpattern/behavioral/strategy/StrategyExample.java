package practice.designpattern.behavioral.strategy;

public class StrategyExample {
    public static void main(String args[]){
       ThuNgan moiMoi = new ThuNgan();

        moiMoi.pay(new CashPayment(), 100);
        moiMoi.pay(new BankTransferPayment("Tran B", "Cua hang goc pho"), 210);
        moiMoi.pay(new CreditCardPayment("TRAN DAI CU OC", "201010101"), 1000);
    }
}
