package P1ProductPricingSystem;

public class Furniture extends Product{
    private String material; //material(wood, plastic, steel)
    private double shippingCost;

    public Furniture(){}
    public Furniture(String productName, double price, String material, double shippingCost) {
        if (productName.isEmpty() || price < 0) {
            System.out.println("Invalid Input");
        }
        super();
    }

    @Override
    public double getPrice() {
        Product pro = new Furniture();
        return pro.getPrice() + shippingCost;
    }
}
