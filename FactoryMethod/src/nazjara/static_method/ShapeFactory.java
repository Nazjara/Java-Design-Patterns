package nazjara.static_method;

import java.util.Objects;

public class ShapeFactory {

    public static Shape getShape(String shapeType) {
        shapeType = Objects.requireNonNullElse(shapeType, "undefined");

        switch (shapeType) {
            case "CIRCLE": return new Circle();
            case "RECTANGLE": return new Rectangle();
            case "SQUARE": return new Square();
            default: return null;
        }
    }
}
