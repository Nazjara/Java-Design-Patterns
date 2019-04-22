package nazjara.numbers;

public class IntToHexExpression implements Expression {
    private int i;

    public IntToHexExpression(int i) {
        this.i = i;
    }

    @Override
    public String interpret(InterpreterContext context) {
        return context.getHexFormat(i);
    }
}
