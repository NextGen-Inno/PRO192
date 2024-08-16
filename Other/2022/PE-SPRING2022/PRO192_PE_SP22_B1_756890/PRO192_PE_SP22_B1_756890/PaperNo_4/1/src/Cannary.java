
/**
 *
 * @author admin
 */
public class Cannary {
    private String place;
    private int song;

    public Cannary() {
    }

    public Cannary(String place, int song) {
        this.place = place;
        this.song = song;
    }

    public String getPlace() {
        return place.toLowerCase();
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getSong() {
        return song;
    }

    public void setSong(int song) {
        this.song = song;
    }
    
    
    
}
