public class ShapeFactory {

    public Shape getShape(String type, double... params) {

        if (type == null) return null;

        String key = type.trim().toUpperCase();

        switch (key) {
            case "CIRCLE":
                if (params.length == 1)
                    return new Circle(params[0]);
                break;

            case "SQUARE":
                if (params.length == 1)
                    return new Square(params[0]);
                break;

            case "RECTANGLE":
                if (params.length == 2)
                    return new Rectangle(params[0], params[1]);
                break;

            case "TRIANGLE":
                if (params.length == 2)
                    return new Triangle(params[0], params[1]);
                break;
        }

        throw new IllegalArgumentException("Invalid parameters for shape: " + type);
    }
}
