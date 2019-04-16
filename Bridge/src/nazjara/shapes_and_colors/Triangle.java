package nazjara.shapes_and_colors;

public class Triangle extends Shape {

    public Triangle(Color color, int border) {
        super(color, border);
    }

    @Override
    void drawShape() {
        System.out.print("This Triangle colored with: ");
        color.fillWithColor(border);
    }
}
