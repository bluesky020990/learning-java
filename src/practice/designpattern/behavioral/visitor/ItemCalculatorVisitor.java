package practice.designpattern.behavioral.visitor;

public interface ItemCalculatorVisitor {
    int calculator (Food food);
    int calculator (Drink drink);
}
