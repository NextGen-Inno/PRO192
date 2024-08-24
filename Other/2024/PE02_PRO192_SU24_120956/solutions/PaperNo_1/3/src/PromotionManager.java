import java.util.ArrayList;

public class PromotionManager extends ArrayList<Promotion> {

    public void addPromotion(Promotion promotion) {
        this.add(promotion);
    }

    public double getMinDiscountPercentage() {
        if (this.isEmpty()) {
            return 0;
        }
        double minDiscount = Double.MAX_VALUE;
        for (Promotion promotion : this) {
            if (promotion.getDiscountPercentage() < minDiscount) {
                minDiscount = promotion.getDiscountPercentage();
            }
        }
        return minDiscount;
    }

    public double sumDiscountPercentageByValue(double value) {
        double sum = 0;
        for (Promotion promotion : this) {
            if (promotion.getDiscountPercentage() >= value) {
                sum += promotion.getDiscountPercentage();
            }
        }
        return sum;
    }
}
