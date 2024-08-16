public class Robot {
    private String label;
    private int step;

    public Robot(String label, int step) {
        this.label = label;
        this.step = step;
    }

    public String getLabel() {
        return label;
    }

    public int getStep() {
        return step;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setStep(int step) {
        this.step = step;
    }
}