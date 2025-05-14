public class AreaCalculator {
    private static final double PI = Math.PI;

    public double calculate(double radius) {
        return PI * radius * radius;
    }

    public double calculate(double width, double height) {
        return width * height;
    }

    public double calculate(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }

    public double calculate(double side, boolean isSquare) {
        return side * side;
    }
}
