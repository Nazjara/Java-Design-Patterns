package nazjara.cars;

public class MotorcycleBuilder implements Builder {
    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is a body of a motorcycle");
    }

    @Override
    public void insertWheels() {
        product.add("2 wheels are added");
    }

    @Override
    public void addHeadLights() {
        product.add("1 headlight is added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
