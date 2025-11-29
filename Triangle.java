public class Triangle implements Shape {
    private double base, height;

    public Triangle() {
        this.base = 1.0;
        this.height = 1.0;
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Triangle");
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}
