public class Square extends Rectangle {

    private String unit = "cm";

    public Square(int side) {
        super(side, side);
    }

    public void setSquare(int side) {
        if (side > 0) {
            super.setLength(side);
            super.setWidth(side);
        }
    }

    public int getPerimeter() {
        return 2 * (super.getLength() + super.getWidth());
    }

    public void output() {
        System.out.println("the side of the square=" + super.getLength() + "(" + unit + ")");
        System.out.println("the perimeter of the square=" + getPerimeter() + "(" + unit + ")");
    }
}
