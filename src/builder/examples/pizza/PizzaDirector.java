package builder.examples.pizza;


public class PizzaDirector {

    private PizzaBuilder pizzaBuilder;

    public PizzaDirector(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza getPizza(){
        return pizzaBuilder.getPizza();
    }

    public PizzaDirector makePizza(Ingredients topping){
        pizzaBuilder.createNewPizzaProduct();
        pizzaBuilder.setTopping(topping);
        return this;
    }

}
