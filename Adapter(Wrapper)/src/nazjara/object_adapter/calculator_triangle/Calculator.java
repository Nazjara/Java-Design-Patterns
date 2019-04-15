package nazjara.object_adapter.calculator_triangle;

public class Calculator implements CalculatorInterface {
    public Rectangle rectangle;

    @Override
    public double getArea(Rectangle rectangle) {
        this.rectangle = rectangle;

        return rectangle.length * rectangle.width;
    }
}
