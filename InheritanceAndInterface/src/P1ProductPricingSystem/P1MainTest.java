package P1ProductPricingSystem;

import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class P1MainTest {
    public static double sumProducts(Product[] col) {
        double sum = 0.0;
        if (col == null) {
            return 0.0;
        }
        for (Product p : col) {
            if (p != null) { // avoid NPE
                sum += p.getPrice();
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Clothing("Product Clothing A", 100,"brand A" , 20);
        products[1] = new Electronics("Product Clothing B", 200, Month.DECEMBER , 20);
        products[2] = new Furniture("Product Clothing C", 300,"Material C" , 20);

        System.out.println("Product list:");
        for (Product p : products) {
            if (p != null){
                System.out.println(p);
                System.out.println("Price for sale is : " + p.getPrice() + "\n");
                }
        }

        double total = sumProducts(products);
        System.out.println("Total price = " + total);
    }
}