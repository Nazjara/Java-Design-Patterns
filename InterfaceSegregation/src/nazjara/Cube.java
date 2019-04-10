package nazjara;

public class Cube implements ShapeInterface, SolidShapeInterface, ManageShapeInterface {

    @Override
    public double area() {
        return 1.0;
    }

    @Override
    public double volume() {
        return 1.0;
    }

    @Override
    public double calculate() {
        return this.area() + this.volume();
    }
}
