package nazjara.colors_and_shapes;

public class Client {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        Shape shape1 = shapeFactory.getShape("circle");
        Shape shape2 = shapeFactory.getShape("rectangle");
        Shape shape3 = shapeFactory.getShape("square");
        shape1.draw();
        shape2.draw();
        shape3.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        Color color1 = colorFactory.getColor("red");
        Color color2 = colorFactory.getColor("blue");
        Color color3 = colorFactory.getColor("green");
        color1.fill();
        color2.fill();
        color3.fill();
    }
}
