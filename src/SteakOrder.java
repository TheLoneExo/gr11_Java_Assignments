
public class SteakOrder {
    String type;
    String doneness;
    String side;
    String drinkBrand;
    boolean isBundle;
    boolean isBundleDiscounted; // NEW: tracks if this order got bundle discount

    public SteakOrder(String type, String doneness, String side, String drinkBrand, boolean isBundle, boolean isBundleDiscounted) {
        this.type = type;
        this.doneness = doneness;
        this.side = side;
        this.drinkBrand = drinkBrand;
        this.isBundle = isBundle;
        this.isBundleDiscounted = isBundleDiscounted;
    }

    public double getPrice() {
        double price = 0.0;

        switch (type.toLowerCase()) {
            case "ribeye": price += 20; break;
            case "sirloin": price += 18; break;
            case "tenderloin": price += 25; break;
            case "t-bone": price += 22; break;
            case "ny strip": price += 21; break;
            default: price += 15; break;
        }

        if (isBundle) {
            price += 3; // fries assumed as required side
            price += 2; // drink
            if (isBundleDiscounted) {
                price -= 3; // discount applies only once
            }
        } else {
            switch (side.toLowerCase()) {
                case "fries": price += 3; break;
                case "poutine": price += 5; break;
                case "mashed potatoes": price += 4; break;
                case "caesar salad": price += 4; break;
                case "onion rings": price += 3.5; break;
                case "none": break;
            }
            if (!drinkBrand.isEmpty()) price += 2;
        }

        return price;
    }

    public String getKey() {
        return (type + "-" + doneness + "-" + side + "-" + drinkBrand + "-" + isBundle).toLowerCase();
    }

    @Override
    public String toString() {
        return String.format("Steak: %s (%s), Side: %s, Drink: %s, %s%s",
                type, doneness, side,
                drinkBrand.isEmpty() ? "No drink" : drinkBrand,
                isBundle ? "Bundle" : "Individual",
                isBundleDiscounted ? " (Discounted)" : "");
    }
}
