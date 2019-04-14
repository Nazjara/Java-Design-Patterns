package nazjara.restaurant;

public class NonVegMealBuilder implements MealBuilder {

    private Meal meal;

    public NonVegMealBuilder() {
        this.meal = new Meal();
    }

    @Override
    public void buildBurger() {
        meal.addItem(new ChickenBurger());
    }

    @Override
    public void buildDrink() {
        meal.addItem(new Coke());
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
