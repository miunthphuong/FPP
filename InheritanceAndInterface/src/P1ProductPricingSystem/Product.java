package P1ProductPricingSystem;

public class Product {
    protected String productName;
    protected double price;

    public Product() {}

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return this.productName;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product Name: " + productName + ", Price: " + price;
    }
}
