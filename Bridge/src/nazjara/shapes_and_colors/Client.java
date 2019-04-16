package nazjara.shapes_and_colors;

public class Client {

    public static void main(String[] args) {
        Color color1 = new GreenColor();
        Color color2 = new RedColor();

        Shape shape1 = new Triangle(color1, 20);
        Shape shape2 = new Rectangle(color2, 50);

        System.out.println("Coloring triangle:");
        shape1.drawShape();
        System.out.println("Let's change border 3 times");
        shape1.modifyBorder(3);

        System.out.println("----------------------------");

        System.out.println("Coloring rectangle:");
        shape2.drawShape();
        System.out.println("Let's change border 2 times");
        shape2.modifyBorder(2);
    }
}
