public class FactoryPatternDemo {
    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.getShape("CIRCLE", 2.0);
        Shape square = factory.getShape("SQUARE", 3.0);

        System.out.println("Circle -> ");
        circle.draw();
        System.out.println("Area: " + circle.area());

        System.out.println("\nSquare -> ");
        square.draw();
        System.out.println("Area: " + square.area());
    }
}
