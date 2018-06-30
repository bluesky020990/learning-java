package practice.designpattern.behavioral.mediator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Waiter implements WaiterMediator {
    private String name;
    private List<ClientDetails> clientDetails;
    private List<Cooker> cookerList;


    public Waiter(String name) {
        this.name = name;
        this.clientDetails = new ArrayList<>();
        this.cookerList = new ArrayList<>();
    }

    public void addCooker(Cooker cooker){
        this.cookerList.add(cooker);
    }

    private class ClientDetails{
        protected  Client client;
        protected List<String>  foods;
        protected Boolean isFinished;

        protected ClientDetails(Client client,  List<String> foods){
            this.client = client;
            this.foods = foods;
            this.isFinished = false;
        }

        protected void crossTheMeal (String meal){
            System.out.println("Give the meal " + meal + " to client " + this.client.getName() + " at table " + this.client.getTableNumber());

            Iterator iterator = this.foods.iterator();
            while (iterator.hasNext()){
                iterator.next();
                if(iterator.equals(meal)){
                    iterator.remove();
                }
            }

            if(this.foods.size() == 0){
                this.isFinished = true;
            }
        }
    }



    @Override
    public void orderTheFood(Client client, List<String>  meals) {
        this.clientDetails.add(new ClientDetails(client, meals));
        this.sendTheOrderToCooker(meals);
    }

    private void sendTheOrderToCooker(List<String> meals) {
        for(String meal : meals){
            Cooker free = null;
            for(Cooker cooker : cookerList){
                if(! cooker.isBusy()){
                    free = cooker;
                    break;
                }
            }
            if(free != null){
                free.makeTheMeals(meal, this);
            }
        }
    }

    @Override
    public void deliveryMeal(String meal) {
        for(ClientDetails clientDetails : this.clientDetails){
            if(clientDetails.foods.contains(meal)){
                clientDetails.crossTheMeal(meal);

                if(clientDetails.isFinished){
                    this.clientDetails.remove(clientDetails);
                }
            }
        }
    }
}
