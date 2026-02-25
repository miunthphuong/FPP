package P3ImmutableRecord;
import java.util.Scanner;

public class P3Main {
    void main() {
        display();
    }

    public void display() {
        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Enter F for Flight, H for Hotel, C for Car Rental:");
            choice = sc.next().toUpperCase();
            switch (choice) {
                case "F" -> {
                    System.out.print("Enter origin: ");
                    String o = sc.next();
                    System.out.print("Enter destination: ");
                    String d = sc.next();
                    System.out.print("Enter distance (km): ");
                    double dist = sc.nextDouble();
                    System.out.print("Enter speed (km/h): ");
                    double speed = sc.nextDouble();
                    FlightBooking f = new FlightBooking(o, d, dist);
                    System.out.printf("Estimated Flight Time: %.2f hours\n", f.computeFlightTime(speed));
                }
                case "H" -> {
                    System.out.print("Enter hotel: ");
                    String n = sc.next();
                    System.out.print("Enter nights: ");
                    int nights = sc.nextInt();
                    System.out.print("Enter price: ");
                    double p = sc.nextDouble();
                    HotelBooking h = new HotelBooking(n, nights, p);
                    System.out.printf("Total Hotel Cost: %.2f\n", h.totalCost());
                }
                case "C" -> {
                    System.out.print("Enter car model: ");
                    String m = sc.next();
                    System.out.print("Enter days: ");
                    int days = sc.nextInt();
                    System.out.print("Enter rate: ");
                    double r = sc.nextDouble();
                    System.out.print("Enter miles/day: ");
                    double mi = sc.nextDouble();
                    CarRental c = new CarRental(m, days, r, mi);
                    System.out.printf("""
                                    Total Rental Cost: %.2f
                                    Total Miles: %.2f
                                    """,
                                    c.totalRentalCost(), c.totalMilesAllowed());
                }
            }
            System.out.print("Do you want to continue (y/n)? ");
        } while (sc.next().equalsIgnoreCase("y"));
    }
}
