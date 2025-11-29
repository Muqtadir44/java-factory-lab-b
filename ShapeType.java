public enum ShapeType {
    CIRCLE(Circle.class),
    SQUARE(Square.class),
    RECTANGLE(Rectangle.class),
    TRIANGLE(Triangle.class);

    private Class<? extends Shape> clazz;

    ShapeType(Class<? extends Shape> clazz) {
        this.clazz = clazz;
    }

    public Class<? extends Shape> getClazz() {
        return clazz;
    }
}
