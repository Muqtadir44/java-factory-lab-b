package lab.factory02;
public class ShapeFactory {

    // Simple factory method
    public Shape getShape(String shapeType) {
        if (shapeType == null) return null;
        String key = shapeType.trim().toUpperCase();
        switch (key) {
            case "CIRCLE":
                return new Circle();
            case "SQUARE":
                return new Square();
            case "RECTANGLE":
                return new Rectangle();
            default:
                return null;
        }
    }
}
