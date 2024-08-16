
/**
 *
 * @author admin
 */
public class Cape {
    private String tailor;
    private int color;

    public Cape() {
    }

    public Cape(String tailor, int color) {
        this.tailor = tailor;
        this.color = color;
    }

    public String getTailor() {
        return tailor;
    }

    public void setTailor(String tailor) {
        this.tailor = tailor;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
    
    
    @Override
    public String toString() {
        return  tailor + "," + color ;
    }
    
    public void setData(){
        tailor = tailor.substring(0, tailor.length()-2) + "ABC";
    }
    
    public int getValue(){
        if (Character.isDigit(tailor.charAt(0)) == true) {
            return color+ 4;
        }else {
            return color+ 11;
        }
    }
    
    
}
