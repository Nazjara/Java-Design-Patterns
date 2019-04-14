package nazjara.cars;

public class Client {

    public static void main(String[] args) {
        Director director = new Director();

        Builder carBuilder = new CarBuilder();
        Builder motorcycleBuilder = new MotorcycleBuilder();

        director.construct(carBuilder);
        Product product1 = carBuilder.getVehicle();
        product1.show();

        System.out.println("------------------------------");

        director.construct(motorcycleBuilder);
        Product product2 = motorcycleBuilder.getVehicle();
        product2.show();
    }
}
