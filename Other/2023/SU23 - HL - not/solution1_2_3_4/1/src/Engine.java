public class Engine {
    private String designer;
    private int power;
    public Engine() {
    }
    
    public Engine(String designer, int power) {
        this.designer = designer;
        this.power = power;
    }
    
    public String getDesigner() {
        String s = designer.substring(0, 3); 
        s = s.substring(0, 1).toUpperCase() + s.substring(1); 
        return s;
    }
    

    public int getPower() {
        return power;
    }
    

    public void setPower(int power) {
        this.power = power;
    }
}

