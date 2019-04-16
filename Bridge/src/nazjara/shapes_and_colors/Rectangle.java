package nazjara.shapes_and_colors;

public class Rectangle extends Shape {

    public Rectangle(Color color, int border) {
        super(color, border);
    }

    @Override
    void drawShape() {
        System.out.print("This Rectangle colored with: ");
        color.fillWithColor(border);
    }
}
