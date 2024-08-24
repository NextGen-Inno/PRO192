public class Triangle extends Shape {
    private double a, b, c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isValidData() {
        return (a < b + c) && (b < a + c) && (c < a + b);
    }

    @Override
    public double calPerimeter() {
        if (isValidData()) {
            return a + b + c;
        } else {
            return 0;
        }
    }

    @Override
    public double calArea() {
        if (isValidData()) {
            double p = calPerimeter() / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.format("%s,%.2f,%.2f,%.2f", getColor(), a, b, c);
    }
}