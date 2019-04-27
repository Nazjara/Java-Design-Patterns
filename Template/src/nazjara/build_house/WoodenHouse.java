package nazjara.build_house;

public class WoodenHouse extends HouseTemplate {

    @Override
    protected void buildWalls() {
        System.out.println("Building wooden walls");
    }

    @Override
    protected void buildPillars() {
        System.out.println("Building pillars with wood coating");
    }
}
