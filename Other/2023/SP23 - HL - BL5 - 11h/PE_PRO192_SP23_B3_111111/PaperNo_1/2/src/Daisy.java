
public class Daisy implements Flower {
    
    @Override
    public int bloom_at(int currHour) {
        int bloomHour = currHour + 5;
        if (bloomHour > 24) {
            bloomHour = bloomHour - 24;
        }
        return bloomHour;
    }
    
    @Override
    public int fade_at(int currHour) {
        int fade = currHour + 10;
        if (fade > 24) {
            fade = fade - 24;
        }
        return fade;
    }
    
    @Override
    public int price(int num) {
        int price = Flower.unitPrice * num;
        return price;
    }
    
}
