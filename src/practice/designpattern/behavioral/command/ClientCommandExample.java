package practice.designpattern.behavioral.command;

public class ClientCommandExample {
    public static void main(String args[]){
        CommandReceiver vungTau = TouristInvoke.getReceiveCommand("Vung Tau");

        HotelCommand hotelCommand = new HotelCommand(vungTau);
        hotelCommand.execute();

        RestaurantCommand restaurantCommand = new RestaurantCommand(vungTau);
        restaurantCommand.execute();

        BeerClubCommand beerClubCommand = new BeerClubCommand(vungTau);
        beerClubCommand.execute();
    }
}
