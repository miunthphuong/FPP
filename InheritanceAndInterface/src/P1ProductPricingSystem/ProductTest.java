package P1ProductPricingSystem;

import java.time.Month;

class ProductTest {

     static void main(String[] args) {
        Product[] products = new Product[6];
         products[0] = new Clothing("Product Clothing A", 100,"brand A" , 10);
         products[1] = new Electronics("Product Clothing B", 200, Month.DECEMBER , 20);
         products[2] = new Furniture("Product Clothing C", 300,"Material C" , 30);
         products[3] = new Clothing("Product Clothing D", 400,"brand D" , 40);
         products[4] = new Electronics("Product Clothing E", 500, Month.NOVEMBER , 50);
         products[5] = new Furniture("Product Clothing F", 600,"Material F" , 60);


        System.out.println("PRODUCT LIST:");
        for (Product p : products) {
            if (p != null){
                System.out.println(p);
                System.out.println("Price for sale is : " + p.getPrice() + "\n");
                }
        }

        double total = P1Main.sumProducts(products);
        System.out.println("Total price = " + total);
    }
}