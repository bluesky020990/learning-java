package practice.designpattern.behavioral.command;

public class RestaurantCommand implements Command {
    private CommandReceiver commandReceiver;

    public RestaurantCommand(CommandReceiver commandReceiver) {
        this.commandReceiver = commandReceiver;
    }

    @Override
    public void execute() {
        this.commandReceiver.getTheRestaurant();
    }
}
