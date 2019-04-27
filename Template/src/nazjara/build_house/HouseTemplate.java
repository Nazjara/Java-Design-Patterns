package nazjara.build_house;

public abstract class HouseTemplate {

    // template method is final, so subclasses cannot override it
    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();

        System.out.println("House is built");
    }

    protected abstract void buildWalls();

    protected abstract void buildPillars();

    // hook methods, default behavior
    private void buildWindows() {
        System.out.println("Building glass windows");
    }

    private void buildFoundation() {
        System.out.println("Building foundation with cement, iron rods and sand");
    }
}
