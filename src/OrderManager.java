

import java.util.*;

public class OrderManager {
    private List<SteakOrder> orders = new ArrayList<>();
    private Map<String, Integer> orderCountMap = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);
    private boolean bundleApplied = false;

    final String[] steakTypes = {"Ribeye", "Sirloin", "Tenderloin", "T-Bone", "NY Strip"};
    final double[] steakPrices = {20, 18, 25, 22, 21};

    final String[] donenessLevels = {
            "Blue Rare", "Rare", "Medium-Rare", "Medium", "Medium-Well", "Well-Done"
    };

    final String[] sides = {"Fries", "Poutine", "Mashed Potatoes", "Caesar Salad", "Onion Rings", "None"};
    final double[] sidePrices = {3, 5, 4, 4, 3.5, 0};

    final String[] drinks = {"Coca-Cola", "Canada Dry", "Pepsi", "Sprite", "Dr Pepper", "Water"};
    final double drinkPrice = 2;

    public void showMenu() {
        System.out.println("\n--- Steakhouse Menu ---");

        System.out.println("Steaks:");
        for (int i = 0; i < steakTypes.length; i++) {
            System.out.printf("  %s - $%.2f\n", steakTypes[i], steakPrices[i]);
        }

        System.out.println("\nDoneness Levels:");
        for (String d : donenessLevels) {
            System.out.println("  " + d);
        }

        System.out.println("\nSides:");
        for (int i = 0; i < sides.length; i++) {
            System.out.printf("  %s - $%.2f\n", sides[i], sidePrices[i]);
        }

        System.out.println("\nDrinks:");
        for (String drink : drinks) {
            System.out.printf("  %s - $%.2f\n", drink, drinkPrice);
        }

        System.out.println("\nBundle Discount: Buy steak + fries + drink together, get $3 off (only once).");
        System.out.println("10% off when ordering 2 or more identical steaks or bundles.");
        System.out.println("Takeout orders have an additional $1 packaging fee.\n");
    }

    public void startOrdering() {
        orders.clear();
        orderCountMap.clear();
        bundleApplied = false;

        boolean ordering = true;
        while (ordering) {
            SteakOrder order = takeOrder();
            orders.add(order);
            String key = order.getKey();
            orderCountMap.put(key, orderCountMap.getOrDefault(key, 0) + 1);

            System.out.print("Add another order? (Yes/No): ");
            ordering = scanner.nextLine().equalsIgnoreCase("Yes");
        }

        boolean isTakeout = false;
        while (true) {
            System.out.print("Dine-in or Takeout? ");
            String place = scanner.nextLine();
            if (place.equalsIgnoreCase("Takeout")) {
                isTakeout = true;
                break;
            } else if (place.equalsIgnoreCase("Dine-in") || place.equalsIgnoreCase("Dine in")) {
                isTakeout = false;
                break;
            } else {
                System.out.println("Invalid option. Please type exactly 'Dine-in' or 'Takeout'.");
            }
        }

        printReceipt(isTakeout);
    }

    private SteakOrder takeOrder() {
        String steak = getValidInput("Choose your steak", steakTypes);
        String doneness = getValidInput("Choose doneness", donenessLevels);
        String side = getValidInput("Choose side", sides);

        String drinkBrand = "";
        while (true) {
            System.out.print("Would you like a drink? (Yes/No): ");
            String drinkAnswer = scanner.nextLine();
            if (drinkAnswer.equalsIgnoreCase("Yes")) {
                drinkBrand = getValidInput("Choose your drink brand", drinks);
                break;
            } else if (drinkAnswer.equalsIgnoreCase("No")) {
                break;
            } else {
                System.out.println("Please answer 'Yes' or 'No'.");
            }
        }

        boolean isBundle = false;
        boolean isBundleDiscounted = false;

        if (side.equalsIgnoreCase("Fries") && !drinkBrand.isEmpty() && !bundleApplied) {
            while (true) {
                System.out.print("Would you like to bundle steak, fries, and drink for a discount? (Yes/No): ");
                String bundleAnswer = scanner.nextLine();
                if (bundleAnswer.equalsIgnoreCase("Yes")) {
                    isBundle = true;
                    isBundleDiscounted = true;
                    bundleApplied = true;
                    break;
                } else if (bundleAnswer.equalsIgnoreCase("No")) {
                    break;
                } else {
                    System.out.println("Please answer 'Yes' or 'No'.");
                }
            }
        }

        return new SteakOrder(steak, doneness, side, drinkBrand, isBundle, isBundleDiscounted);
    }

    private String getValidInput(String prompt, String[] validOptions) {
        while (true) {
            System.out.println(prompt + ": " + Arrays.toString(validOptions));
            System.out.print("> ");
            String input = scanner.nextLine();

            for (String option : validOptions) {
                if (option.equalsIgnoreCase(input)) {
                    return option; // return exact match
                }
            }
            System.out.println("Invalid input. Please type the option exactly as shown.");
        }
    }

    private void printReceipt(boolean isTakeout) {
        double subtotal = 0.0;

        System.out.println("\n--- Receipt ---");

        for (SteakOrder order : orders) {
            double price = order.getPrice();
            System.out.printf("%s - $%.2f\n", order.toString(), price);
            subtotal += price;
        }

        // Discounts for 2+ of same item
        double discountTotal = 0.0;
        for (Map.Entry<String, Integer> entry : orderCountMap.entrySet()) {
            if (entry.getValue() >= 2) {
                double itemPrice = orders.stream()
                        .filter(o -> o.getKey().equals(entry.getKey()))
                        .findFirst()
                        .map(SteakOrder::getPrice)
                        .orElse(0.0);
                double discount = itemPrice * 0.10 * entry.getValue();
                discountTotal += discount;
                System.out.printf("10%% discount applied on %d x '%s' (-$%.2f)\n",
                        entry.getValue(), entry.getKey(), discount);
            }
        }

        double afterDiscount = subtotal - discountTotal;

        if (isTakeout) {
            System.out.println("Takeout packaging fee: $1.00");
            afterDiscount += 1.0;
        }

        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Discounts: -$%.2f\n", discountTotal);

        double gst = afterDiscount * 0.05;
        double hst = afterDiscount * 0.13;

        double totalTaxes = gst + hst;
        double finalTotal = afterDiscount + totalTaxes;

        System.out.printf("GST (5%%): $%.2f\n", gst);
        System.out.printf("HST (13%%): $%.2f\n", hst);
        System.out.printf("Total: $%.2f\n", finalTotal);

        System.out.println("\nThank you for dining at the Steakhouse!");
    }
}
