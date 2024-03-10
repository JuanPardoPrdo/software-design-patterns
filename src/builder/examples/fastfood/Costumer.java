package builder.examples.fastfood;


public class Costumer {

    private Cashier cashier;

    public Costumer(){
        cashier = new Cashier(new ChildrensMealBuilder());
    }

    public Meal getMeal(){
        return cashier.getMeal();
    }

    public void orderMeal(){
        cashier.makeMeal();
    }

};