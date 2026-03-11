package Prob4;

public class TicketingSystemTest {

    public static void main(String[] args) {

        TicketingSystem system = new TicketingSystem();

        // Add tickets
        system.addTicket("Issue 1");
        system.addTicket("Issue 2");
        system.addTicket("Issue 3");
        system.addTicket("Issue 4");
        system.addTicket("Issue 5");

        System.out.println();

        // View next ticket
        System.out.println("Next ticket: " + system.viewNextTicket());

        System.out.println();

        // Process tickets
        system.processTicket();
        system.processTicket();

        System.out.println();

        // Show remaining tickets
        system.displayTickets();
    }
}
