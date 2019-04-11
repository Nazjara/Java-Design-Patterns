package nazjara.concrete_creator;

import java.util.Objects;

public class ShapeFactory {

    public Shape getShape(String shapeType) {
        shapeType = Objects.requireNonNullElse(shapeType, "undefined");

        switch (shapeType) {
            case "CIRCLE": return new Circle();
            case "RECTANGLE": return new Rectangle();
            case "SQUARE": return new Square();
            default: return null;
        }
    }
}
