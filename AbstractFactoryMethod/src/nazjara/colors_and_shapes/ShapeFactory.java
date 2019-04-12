package nazjara.colors_and_shapes;

public class ShapeFactory extends AbstractFactory {

    //stub
    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if(shape == null) {
            return null;
        }

        switch (shape.toLowerCase()) {
            case "circle" : return new Circle();
            case "rectangle": return new Rectangle();
            case "square": return new Square();
            default: return null;
        }
    }
}
