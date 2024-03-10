package builder.examples.pizza;


public class SpicyPizzaBuilder extends PizzaBuilder {

    public SpicyPizzaBuilder(){
        this.createNewPizzaProduct();
        this.setDough(Dough.PANBAKED);
        this.setSauce(Sauce.HOT);
    }

    @Override
    public PizzaBuilder setTopping(Ingredients topping) {
        pizza.setTopping(topping);
        return this;
    }
}
