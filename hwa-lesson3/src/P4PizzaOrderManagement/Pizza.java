package P4PizzaOrderManagement;

enum PizzaSize { SMALL, MEDIUM, LARGE }
enum PizzaType { VEGGIE, PEPPERONI, CHEEZE, BBQ_CHICKEN }

public class Pizza {
    private PizzaSize size;
    private PizzaType type;
    private int quantity;
    private double price;

    public Pizza(PizzaSize size, PizzaType type, int quantity) {
        this.size = size;
        this.type = type;
        this.quantity = quantity;
        calculatePrice();
    }

    private void calculatePrice() {
        // Switch expression for size and type prices
        double sizePrice = switch (size) {
            case SMALL -> 8.0;
            case MEDIUM -> 10.0;
            case LARGE -> 12.0;
        };

        double typePrice = switch (type) {
            case VEGGIE -> 1.0;
            case PEPPERONI, BBQ_CHICKEN -> 2.0;
            case CHEEZE -> 1.5;
        };

        this.price = (sizePrice + typePrice) * quantity;
    }

    public String printOrderSummary() {
        double tax = price * 0.03; // 3% tax
        return String.format(""" 
                        Pizza Order:
                        Size: %s
                        Type: %s
                        Qty: %d
                        rice: $%.2f
                        Tax: $%.2f
                        Total Price: $%.2f
                        """,
                        size, type, quantity, price, tax, (price + tax));
    }
}
