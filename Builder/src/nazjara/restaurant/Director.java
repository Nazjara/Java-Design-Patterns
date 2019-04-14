package nazjara.restaurant;

public class Director {
    private MealBuilder mealBuilder;

    public void construct(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;

        mealBuilder.buildBurger();
        mealBuilder.buildDrink();
    }
}
