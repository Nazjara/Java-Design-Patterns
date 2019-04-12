package nazjara.colors_and_shapes;

public class ColorFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        if(color == null) {
            return null;
        }

        switch (color.toLowerCase()) {
            case "blue" : return new Blue();
            case "green": return new Green();
            case "red": return new Red();
            default: return null;
        }
    }

    //stub
    @Override
    Shape getShape(String shape) {
        return null;
    }
}
