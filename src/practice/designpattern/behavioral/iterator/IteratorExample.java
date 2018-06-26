package practice.designpattern.behavioral.iterator;

public class IteratorExample {
    public static void main(String args[]){
        FoodCollection foods = new FootCollectionImp();
        foods.addElement(new Food("Thit Cho", 100, "man"));
        foods.addElement(new Food("Rau muong xao toi", 30, "chay"));
        foods.addElement(new Food("Cu cai cham mam tom", 30, "man"));
        foods.addElement(new Food("Bo xao cai thia", 30, "man"));
        foods.addElement(new Food("Ga chay", 30, "chay"));
        foods.addElement(new Food("Trung chay", 30, "chay"));
        foods.addElement(new Food("Bo chay", 30, "chay"));
        foods.addElement(new Food("Thit de", 30, "man"));

        FootIterator iterator = foods.iterator("chay");
        while (iterator.hasNext()){
            iterator.next().display();
        }
    }
}
