package nazjara.math_strategy;

public class Client {

    public static void main(String[] args) {
        StrategyContext context = new StrategyContext();

        System.out.println("10 + 5 = " + context.performOperation(new AdditionStrategy(), 10, 5));
        System.out.println("10 - 5 = " + context.performOperation(new SubtractionStrategy(), 10, 5));
        System.out.println("10 * 5 = " + context.performOperation(new MultiplicationStrategy(), 10, 5));
    }
}
