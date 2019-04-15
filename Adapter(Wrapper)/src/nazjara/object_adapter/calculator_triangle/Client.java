package nazjara.object_adapter.calculator_triangle;

public class Client {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(20, 10);

        CalculatorInterface calculatorInterface = new CalculatorAdapter(triangle);
        System.out.println("Area of triangle is: " + calculatorInterface.getArea(new Rectangle()));
    }
}
