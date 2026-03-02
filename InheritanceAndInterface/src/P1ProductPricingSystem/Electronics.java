package P1ProductPricingSystem;

import java.time.Month;

public class Electronics extends Product{
    private Month warranty;
    private double warrantyCost;

    public Electronics(String productName, double price, Month warranty, double warrantyCost) {
        if (productName.isEmpty() || price < 0) {
            System.out.println("Invalid Input");
        }
        this.warranty = warranty;
        this.warrantyCost = warrantyCost;
        super(productName, price);
    }

    @Override
    public double getPrice() {
        return price + warrantyCost;
    }

    @Override
    public String toString() {
        return "Electronics -> " + super.toString() +
                ", Warranty: " + warranty + " months" +
                ", Warranty Cost: " + warrantyCost;
    }
}
