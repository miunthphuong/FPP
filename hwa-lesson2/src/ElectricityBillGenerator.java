import java.util.Scanner;
public class ElectricityBillGenerator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String con;
        do {
            printUsage(sc);
            System.out.print("Do you want to calculate another bill? (y/n): ");
            con = sc.nextLine().trim();
        } while(con.equalsIgnoreCase("y"));
        sc.close();
    }
    static void printUsage(Scanner sc){
        System.out.print("Enter user type (R/C/I): ");
        String userType = sc.nextLine().trim().toUpperCase();
        System.out.print("Enter units consumed: ");
        String unitConsumed = sc.nextLine().trim();
        int unit = Integer.parseInt(unitConsumed);
        float billAmount = switch(userType){
            case "R"-> 0.12f * unit;
            case "C"-> 0.20f * unit;
            case "I"-> 0.35f * unit;
            default-> 0.00f;
        };
        System.out.println("=== Electricity Bill ===");
        System.out.printf("User Type: %s\n", userType);
        System.out.printf("Unit: %s\n", unitConsumed);
        System.out.printf("Bill Amount: $%.2f\n", billAmount);
    }
}
