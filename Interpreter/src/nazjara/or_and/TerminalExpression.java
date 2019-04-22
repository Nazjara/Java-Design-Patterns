package nazjara.or_and;

public class TerminalExpression implements Expression {
    private String input;

    public TerminalExpression(String input) {
        this.input = input;
    }

    @Override
    public boolean interpret(InterpreterContext context) {
        return context.getResult(input);
    }
}
