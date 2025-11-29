public class ShapeFactory {

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
            case "TRIANGLE":              
                return new Triangle();
            default:
                return null;
        }
    }
}
