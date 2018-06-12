package practice.designpattern.behavioral.command;

public class HotelCommand implements Command {
    private CommandReceiver commandReceiver;

    public HotelCommand(CommandReceiver commandReceiver) {
        this.commandReceiver = commandReceiver;
    }

    @Override
    public void execute() {
        this.commandReceiver.getTheHotel();
    }
}
