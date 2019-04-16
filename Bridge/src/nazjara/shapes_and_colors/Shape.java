package nazjara.shapes_and_colors;

public abstract class Shape {
    protected Color color;
    protected int border;

    public Shape(Color color, int border) {
        this.color = color;
        this.border = border;
    }

    abstract void drawShape();

    protected void modifyBorder(int times) {
        this.border = border * times;
        drawShape();
    }
}
