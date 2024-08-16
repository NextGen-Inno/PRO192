
/**
 *
 * @author admin
 */
public class SpecCape extends Cape{
    private int type;

    public SpecCape() {
    }

    public SpecCape(int type) {
        this.type = type;
    }

    public SpecCape( String tailor, int color,int type) {
        super(tailor, color);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.getTailor()+ "," + super.getColor() +"," + type;
    }
    
    
    
    
}
