package nazjara.shapes_and_colors;

public class GreenColor implements Color {

    @Override
    public void fillWithColor(int border) {
        System.out.println("Green color with " + border + " border");
    }
}
