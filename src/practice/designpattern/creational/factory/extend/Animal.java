package practice.designpattern.creational.factory.extend;

public abstract class Animal {
    protected Animal(){}

    public static Animal getDog(){
        return new Dog();
    }

    public static Animal getCat(){
        return new Cat();
    }

    public Animal getAnimal(String type){
        if (type.equals("cat")) {
            return new Cat();
        } else if (type.equals("dog")){
            return new Dog();
        } else {
            return null;
        }
    }
}
