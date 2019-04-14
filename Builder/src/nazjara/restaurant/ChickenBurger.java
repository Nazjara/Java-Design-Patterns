package nazjara.restaurant;

public class ChickenBurger extends Burger {

    @Override
    public String getName() {
        return "Chicken Burger";
    }

    @Override
    public Double getPrice() {
        return 20.0;
    }
}
