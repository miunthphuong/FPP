package Prob4;
import java.util.Queue;
import java.util.LinkedList;

public class TicketingSystem {
    private Queue<Ticket> queue;
    private int nextId;

    // Default constructor
    public TicketingSystem() {
        queue = new LinkedList<>();
        nextId = 1;
    }

    // Add ticket
    public void addTicket(String description) {
        Ticket ticket = new Ticket(nextId++, description);
        queue.offer(ticket);
        System.out.println("Added: " + ticket);
    }

    // Process ticket (remove from queue)
    public Ticket processTicket() {
        if (queue.isEmpty()) {
            System.out.println("No tickets to process.");
            return null;
        }
        Ticket ticket = queue.poll();
        System.out.println("Processing: " + ticket);
        return ticket;
    }

    // View next ticket without removing
    public Ticket viewNextTicket() {
        if (queue.isEmpty()) {
            System.out.println("No tickets in queue.");
            return null;
        }
        return queue.peek();
    }

    // Check empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Show all tickets
    public void displayTickets() {
        System.out.println("Current Tickets in Queue:");
        for (Ticket t : queue) {
            System.out.println(t);
        }
    }
}
