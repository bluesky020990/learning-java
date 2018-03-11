package practice.basic.createobject;

public class BMWCar extends Car implements Vehicle {

    int wheels = 4;

    public BMWCar() {

    }

    @Override
    public void numberOfWheels() {
        System.out.println("The Car has " + this.wheels + " Wheels!!");
    }

    @Override
    public void speedOfVehicle() {
        int speed = 50;
        System.out.println("The Car runs with " + speed +"km/h");
    }

    @Override
    public void carColor() {
        System.out.println("Color of Car is Blue");
    }

    public static void main (String args[]){
        BMWCar bmwCar = new BMWCar();
        bmwCar.carColor();
        bmwCar.numberOfWheels();
        bmwCar.speedOfVehicle();

    }
}
