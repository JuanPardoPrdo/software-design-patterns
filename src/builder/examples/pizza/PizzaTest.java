package builder.examples.pizza;


public class PizzaTest {

    public static void main(String[] args) {

        Pizza pizza = new PizzaDirector(new SpicyPizzaBuilder())
                .makePizza(Ingredients.HAM)
                .getPizza();

        System.out.println(pizza.toString());

    }

}
