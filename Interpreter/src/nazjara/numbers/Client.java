package nazjara.numbers;

public class Client {
    public InterpreterContext context;

    public Client(InterpreterContext context) {
        this.context = context;
    }

    public String interpret(String s) {
        Expression expression;

        if (s.contains("Hexadecimal")) {
            expression = new IntToHexExpression(Integer.parseInt(s.substring(0, s.indexOf(" "))));
        } else if (s.contains("Binary")) {
            expression = new IntToBinaryExpression(Integer.parseInt(s.substring(0, s.indexOf(" "))));
        } else {
            return s;
        }

        return expression.interpret(context);
    }

    public static void main(String[] args) {
        String s1 = "28 in Binary";
        String s2 = "28 in Hexadecimal";

        Client client = new Client(new InterpreterContext());
        System.out.println(client.interpret(s1));
        System.out.println(client.interpret(s2));
    }
}
