package practice.designpattern.behavioral.command;

public class VungTauReceiver implements CommandReceiver {
    @Override
    public void getTheHotel() {
        System.out.println("Chung ta se ngu lai o khach san ABC");
    }

    @Override
    public void getTheRestaurant() {
        System.out.println("Chung ta se an tai nha hang ABC");
    }

    @Override
    public void getTheBeerClub() {
        System.out.println("Chung ta se vui choi tai nha hang ABC");
    }
}
