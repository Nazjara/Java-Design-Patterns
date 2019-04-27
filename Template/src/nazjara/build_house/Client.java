package nazjara.build_house;

public class Client {

    public static void main(String[] args) {
        HouseTemplate houseTemplate = new WoodenHouse();
        houseTemplate.buildHouse();

        System.out.println("--------------------------");

        houseTemplate = new GlassHouse();
        houseTemplate.buildHouse();

    }
}
