package practice.designpattern.behavioral.iterator;

public interface FoodCollection {

    void addElement(Food food);
    void removeElement(Food food);
    FootIterator iterator(String category);
}
