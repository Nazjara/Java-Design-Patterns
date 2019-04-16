package nazjara.shapes_and_colors;

public class RedColor implements Color {

    @Override
    public void fillWithColor(int border) {
        System.out.println("Red color with " + border + " border");
    }
}
