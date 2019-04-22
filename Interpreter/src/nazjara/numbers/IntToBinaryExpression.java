package nazjara.numbers;

public class IntToBinaryExpression implements Expression {
    private int i;

    public IntToBinaryExpression(int i) {
        this.i = i;
    }

    @Override
    public String interpret(InterpreterContext context) {
        return context.getBinaryFormat(i);
    }
}
