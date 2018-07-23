package practice.designpattern.creational.abstract_factory.example_3;

public class ComputerFactory {
    public static void main (String args[]){
        Computer pc = ComputerFactory.getComputer(new PCFactory("2GB", "500GB", "2.4 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("4GB", "1TB", "2.0 GHz"));


        System.out.println(pc.toString());
        System.out.println(server.toString());
    }


    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
