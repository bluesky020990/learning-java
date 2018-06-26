package practice.designpattern.behavioral.iterator;

public class Food {
    private String name;
    private int cost;
    private String type;

    public Food(String name, int cost, String type) {
        this.name = name;
        this.cost = cost;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void display(){
        System.out.println("Day la mon " + name + " co gia " + cost + "(" + type + ")");
    }
}

