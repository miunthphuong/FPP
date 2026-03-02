package P1ProductPricingSystem;

public class Clothing extends Product{
    private String brand;
    private int discount; // discount value(eg: 5 or 10 or 20)

    public Clothing(){}
    public Clothing(String productName, double price, String brand, int discount) {
        if (productName.isEmpty() || price < 0) {
            System.out.println("Invalid Input");
        }
        super();
    }

    @Override
    public double getPrice() {
        Product pro = new Clothing();
        return pro.getPrice() - pro.getPrice() * discount / 100;
    }
}
