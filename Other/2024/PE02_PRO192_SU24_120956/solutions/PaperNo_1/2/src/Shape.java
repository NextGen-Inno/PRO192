public abstract class Shape {
    private String color;

    public Shape() {
        this.color = "Black";
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double calArea();
    public abstract double calPerimeter();
}