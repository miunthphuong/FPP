package P1ProductPricingSystem;

public class P1Main {
    public static void main(String[] args) {

    }

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

}
