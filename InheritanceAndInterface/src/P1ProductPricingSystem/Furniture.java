package P1ProductPricingSystem;

public class Furniture extends Product{
    private String material; //material(wood, plastic, steel)
    private double shippingCost;

    public Furniture(String productName, double price, String material, double shippingCost) {
        if (productName.isEmpty() || price < 0) {
            System.out.println("Invalid Input");
        }
        this.material = material;
        this.shippingCost = shippingCost;
        super(productName, price);
    }

    @Override
    public double getPrice() {
        return price + shippingCost;
    }

    @Override
    public String toString() {
        return "FURNITURE: " + super.toString() +
                ", Material: " + material +
                ", Shipping Cost: " + shippingCost;
    }
}
