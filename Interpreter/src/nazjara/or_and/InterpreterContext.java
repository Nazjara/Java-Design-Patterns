package nazjara.or_and;

public class InterpreterContext {
    private String input;

    public InterpreterContext(String input) {
        this.input = input;
    }

    boolean getResult(String expression) {
        if (input.contains(expression)) {
            return true;
        }

        return false;
    }
}
