package prob1;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantity = 0;
        boolean valid = false;
//        3. Graceful retry
        while (!valid) {
            try {
                System.out.print("Enter quantity of items to add (1-50): ");
                quantity = sc.nextInt();
//                2. Handle invalid range
                if (quantity < 1 || quantity > 50) {
                    throw new IllegalArgumentException("Quantity must be between 1 and 50.");
                }
                valid = true; // input is correct
            } catch (InputMismatchException e) {
//                1. Handle wrong input type
                System.out.println("Invalid input! Please enter a number.");
                sc.nextLine(); // clear wrong input
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Successfully added " + quantity + " items to your cart!");
        sc.close();
    }
}
