package nazjara.object_adapter.calculator_triangle;

public class CalculatorAdapter implements CalculatorInterface {
    CalculatorInterface calculator;
    Triangle triangle;

    public CalculatorAdapter(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public double getArea(Rectangle rectangle) {
        calculator = new Calculator();

        rectangle.length = triangle.base;
        rectangle.width = triangle.height * 0.5;

        return calculator.getArea(rectangle);
    }
}
