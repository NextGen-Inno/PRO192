
public class Square extends Rectangle {

    private String unit;

    public Square() {
    }

    public Square(int side) {
        super.setLength(side);
        super.setWidth(side);
        this.unit = "cm";
    }

    public void setSquare(int side) {
        if (side > 0) {
            super.setLength(side);
            super.setWidth(side);
        }
    }
    
    public int getPerimeter() {
        return (super.getWidth() + super.getLength()) * 2;
    }
    
    public void output() {
        String s1 = "the side of the square=" + super.getWidth() + "(" + unit + ")";
        String s2 = "the perimeter of the square=" + getPerimeter() + "(" + unit + ")";
        System.out.println(s1);
        System.out.println(s2);
    }
    
}
