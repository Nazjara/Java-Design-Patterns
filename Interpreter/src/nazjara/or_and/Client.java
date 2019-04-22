package nazjara.or_and;

public class Client {

    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    public static Expression getMarriedWomanExpression () {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        InterpreterContext context = new InterpreterContext("John");
        System.out.println(isMale.interpret(context));

        context = new InterpreterContext("Married Julie");
        System.out.println(isMarriedWoman.interpret(context));

        context = new InterpreterContext("Lucy");
        System.out.println(isMale.interpret(context));
    }
}
