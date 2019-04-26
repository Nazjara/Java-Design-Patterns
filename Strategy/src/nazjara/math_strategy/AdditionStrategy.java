package nazjara.math_strategy;

public class AdditionStrategy implements MathStrategy {

    @Override
    public int performOperation(int i1, int i2) {
        return i1 + i2;
    }
}
