package practice.designpattern.behavioral.visitor;

public class ItemCalculatorVisitorImp implements ItemCalculatorVisitor {
    @Override
    public int calculator(Food food) {
        return food.getPrize();
    }

    @Override
    public int calculator(Drink drink) {
        if(drink.getSize().equals("M")){
            return drink.getPrize() * 2;
        } else if(drink.getSize().equals("L")){
            return drink.getPrize() * 3;
        } else {
            return drink.getPrize();
        }
    }
}
