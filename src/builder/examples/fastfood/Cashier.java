package builder.examples.fastfood;


public class Cashier {

    private MealBuilder mealBuilder;

    public Cashier(MealBuilder mealBuilder){
        this.mealBuilder = mealBuilder;
    }

    public Meal getMeal(){
        return this.mealBuilder.getMeal();
    }

    public void makeMeal() {
        this.mealBuilder.buildBurger();
        this.mealBuilder.buildComplement();
        this.mealBuilder.buildDrink();
        this.mealBuilder.buildToy();
    }


}
