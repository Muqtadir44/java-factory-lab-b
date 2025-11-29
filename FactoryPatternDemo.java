package lab.factory02;
import java.util.Arrays;
import java.util.List;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        // Example inputs (simulate user commands)
        List<String> commands = Arrays.asList("CIRCLE", "square", "Rectangle", "unknown");

        for (String cmd : commands) {
            Shape shape = factory.getShape(cmd);
            System.out.print("Command: " + cmd + " -> ");
            if (shape != null) {
                shape.draw();
            } else {
                System.out.println("No such shape found.");
            }
        }
    }
}