package practice.designpattern.behavioral.command;

public class TouristInvoke {
    public Command command;

    public TouristInvoke(Command c) {
        this.command = c;
    }

    public void execute() {
        this.command.execute();
    }

    public static CommandReceiver getReceiveCommand(String address){
        if(address.equals("Vung Tau")){
            return new VungTauReceiver();
        } else if(address.equals("Da Nang")){
            return new DaNangReceiver();
        } else {
            return null;
        }
    }
}
