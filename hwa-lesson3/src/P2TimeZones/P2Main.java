package P2TimeZones;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class P2Main {
    static void main() {
        display();
    }

    public static void display(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the event Name");
        String name = sc.next();
        System.out.println("Enter the event Date in yyyy/MM/dd format");
        String date = sc.next();
        LocalDate formattedDate = LocalDate.parse(date,DateTimeFormatter.ofPattern("yyyy/MM/dd") );
        System.out.println("Enter the event Time in HH:mm format");
        String time = sc.next();
        LocalTime formattedTime = LocalTime.parse(time);

        Event event = new Event(name,formattedDate,formattedTime);
        event.displayDayOfWeek();
        event.isLeapYear();
        event.currentToEventDays();
        event.displayDetails();

        System.out.println("\nEnter Time Zone to Convert (Example: America/Chicago):");
        String zone = sc.next();
        event.convertToTimeZone(zone);

    }
}
