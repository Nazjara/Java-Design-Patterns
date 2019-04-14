package nazjara.restaurant;

public class VegBurger extends Burger {

    @Override
    public String getName() {
        return "Vegetarian burger";
    }

    @Override
    public Double getPrice() {
        return 10.0;
    }
}
