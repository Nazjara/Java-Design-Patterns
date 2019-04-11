package nazjara.static_method;

public class Client {

    public static void main(String[] args) {
       Shape shape1 = ShapeFactory.getShape("CIRCLE");
       Shape shape2 = ShapeFactory.getShape("RECTANGLE");
       Shape shape3 = ShapeFactory.getShape("SQUARE");

       shape1.draw();
       shape2.draw();
       shape3.draw();
    }
}
