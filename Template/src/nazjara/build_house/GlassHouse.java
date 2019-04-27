package nazjara.build_house;

public class GlassHouse extends HouseTemplate {

    @Override
    protected void buildWalls() {
        System.out.println("Building glass walls");
    }

    @Override
    protected void buildPillars() {
        System.out.println("Building pillars with glass coating");
    }
}
