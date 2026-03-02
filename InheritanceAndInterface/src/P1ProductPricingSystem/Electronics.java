package P1ProductPricingSystem;

import java.time.Month;

public class Electronics extends Product{
    private Month warranty;
    private double warrantyCost;

    public Electronics(){}
    public Electronics(String productName, double price, double warranty, double warrantyCost) {
        if (productName.isEmpty() || price < 0) {
            System.out.println("Invalid Input");
        }
        super();
    }

    @Override
    public double getPrice() {
        Product pro = new Electronics();
        return pro.getPrice() + warrantyCost;
    }
}
