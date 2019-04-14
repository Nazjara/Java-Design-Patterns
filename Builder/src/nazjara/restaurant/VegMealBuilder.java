package nazjara.restaurant;

public class VegMealBuilder implements MealBuilder {

    private Meal meal;

    public VegMealBuilder() {
        this.meal = new Meal();
    }

    @Override
    public void buildBurger() {
        meal.addItem(new VegBurger());
    }

    @Override
    public void buildDrink() {
        meal.addItem(new Pepsi());
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
