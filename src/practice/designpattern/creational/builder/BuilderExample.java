package practice.designpattern.creational.builder;

public class BuilderExample {

    public static void main(String args[]){
        Computer computer = new Computer.ComputerBuilder("2tb", "16gb").setGraphicsCardEnabled(true).build();
        System.out.println(computer.toString());
    }
}
