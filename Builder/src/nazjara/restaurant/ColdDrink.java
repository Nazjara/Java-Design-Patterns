package nazjara.restaurant;

public abstract class ColdDrink implements Item {

    @Override
    public Packing getPacking() {
        return new Bottle();
    }
}
