
public class SpecRobot extends Robot {
     private int step;

    public SpecRobot() {
    }

    public SpecRobot(String label, int type, int step) {
        super(label, type);
        this.step = step;
    }

    public void setData() {
        String label = getLabel();
        if (label.length() >= 2) {
            label = label.substring(0, 1) + step + label.substring(1);
            setLabel(label);
        }
    }

    public int getValue() {
        if (getType() < 3 && getLabel().contains("A")) {
            return step;
        } else {
            return step + 2;
        }
    }

    @Override
    public String toString() {
        return getLabel() + "," + getType() + "," + step;
    }
}
