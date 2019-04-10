package nazjara;

public class Square implements ShapeInterface, ManageShapeInterface {

    @Override
    public double calculate() {
        return area();
    }

    @Override
    public double area() {
        return 2.0;
    }
}
