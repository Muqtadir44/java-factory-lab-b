public class Circle implements Shape {
    private double radius;

    public Circle() {        // required for reflection
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
