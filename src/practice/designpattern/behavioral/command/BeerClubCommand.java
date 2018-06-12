package practice.designpattern.behavioral.command;

public class BeerClubCommand implements Command {
    private CommandReceiver commandReceiver;

    public BeerClubCommand(CommandReceiver commandReceiver) {
        this.commandReceiver = commandReceiver;
    }

    @Override
    public void execute() {
        this.commandReceiver.getTheBeerClub();
    }
}
