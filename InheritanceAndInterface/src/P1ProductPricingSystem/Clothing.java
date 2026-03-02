package P1ProductPricingSystem;

public class Clothing extends Product{
    private String brand;
    private int discount; // discount value(eg: 5 or 10 or 20)

    public Clothing(String productName, double price, String brand, int discount) {
        if (productName.isEmpty() || price < 0) {
            System.out.println("Invalid Input");
        }
        this.brand = brand;
        this.discount = discount;
        super(productName, price);
    }

    @Override
    public double getPrice() {
        return price - (price * discount / 100); // Apply discount
    }

    @Override
    public String toString() {
        return "CLOTHING: " + super.toString() +
                ", Brand: " + brand +
                ", Discount: " + discount + "%";
    }
}
