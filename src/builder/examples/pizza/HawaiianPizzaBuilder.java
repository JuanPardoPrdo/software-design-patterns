package builder.examples.pizza;


public class HawaiianPizzaBuilder extends PizzaBuilder{

    public HawaiianPizzaBuilder(){
        this.createNewPizzaProduct();
        this.setDough(Dough.CROSS);
        this.setSauce(Sauce.MILD);
    }

    @Override
    public PizzaBuilder setTopping(Ingredients topping) {
        pizza.setTopping(topping);
        return this;
    }

}
