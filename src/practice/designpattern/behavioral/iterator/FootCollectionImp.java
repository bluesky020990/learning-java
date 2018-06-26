package practice.designpattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class FootCollectionImp implements FoodCollection {
    private List<Food> collection;

    public FootCollectionImp() {
        this.collection = new ArrayList<>();
    }

    @Override
    public void addElement(Food food) {
        this.collection.add(food);
    }

    @Override
    public void removeElement(Food food) {
        this.collection.remove(food);
    }

    @Override
    public FootIterator iterator(String category) {
        return new FootIteratorImpl(this.collection, category);
    }

    private class FootIteratorImpl implements FootIterator{
        private String category;
        private List<Food> foods;
        private int index;

        public FootIteratorImpl(List<Food> foods, String category) {
            this.foods = foods;
            this.index = 0;
            this.category = category;
        }

        @Override
        public boolean hasNext() {
            while (this.index < this.foods.size()) {
                Food c = this.foods.get(this.index);
                if (c.getType().equals(this.category) || this.category.equals("total")) {
                    return true;
                } else{
                    this.index++;
                }

            }
            return false;
        }

        @Override
        public Food next() {
            Food c = this.foods.get(index);
            index++;
            return c;
        }
    }
}
