package practice.designpattern.behavioral.mediator;

public class Client {
    private String name;
    private String tableNumber;

    public Client(String name, String tableNumber) {
        this.name = name;
        this.tableNumber = tableNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(String tableNumber) {
        this.tableNumber = tableNumber;
    }
}
