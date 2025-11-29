public class FactoryPatternDemo {

    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.create(ShapeType.CIRCLE);
        Shape square = factory.create(ShapeType.SQUARE);

        circle.draw();
        square.draw();
    }
}
