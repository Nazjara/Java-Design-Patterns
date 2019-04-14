package nazjara.restaurant;

public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        MealBuilder mealBuilder;

        System.out.println("Veg Meal");
        mealBuilder = new VegMealBuilder();
        director.construct(mealBuilder);
        Meal vegMeal = mealBuilder.getMeal();
        vegMeal.showItems();
        vegMeal.showCost();

        System.out.println("--------------------------------");

        System.out.println("Non Veg Meal");
        mealBuilder = new NonVegMealBuilder();
        director.construct(mealBuilder);
        Meal nonVegMeal = mealBuilder.getMeal();
        nonVegMeal.showItems();
        nonVegMeal.showCost();
    }
}
