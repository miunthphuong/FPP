package prob3;

import java.util.*;
import java.util.stream.Collectors;

public class OrderTest {
    public static void main(String[] args) {

//      a) Create an ArrayList<Order>.
        List<Order> orders = new ArrayList<>();

//        b) add() at least five Order objects.
        Order order1 = new Order("id1", "customer 1", 10.0);
        Order order2 = new Order("id2","customer 2", 200.0);
        Order order3 = new Order("id3","customer 3", 30.0);
        Order order4 = new Order("id4","customer 4", 400.0);
        Order order5 = new Order("id5","customer 5", 60.0);
        orders = new ArrayList<>(Arrays.asList(order1, order2, order3, order4, order5));

//        c) Delete an object by instance (pass an Order you previously added).
        System.out.println("Order list before delete : " + orders + " and \nSize is: " + orders.size());
        System.out.println("Order list after delete : " + deleteOrder(orders, new Order("id1", "customer 1", 100.0)));

//        d) Print the size of the list.
        System.out.println("Size : " + orders.size());

//        e) Retrieve an Order by position (get(index)) and print it.
        System.out.println("Retrieve Order with position 2: " + orders.get(2));

//        f) Update the details of an Order by position (set(index, new Order(...))).
        orders.set(2, new Order("id10","update customer position 2", 200.0));
        System.out.println("Print Order after update the details of an Order by position 2: " + orders);

//        h) Sort by totalAmount (ascending) using a Comparator that’s consistent with equals. Print the sorted list.
        System.out.println("Order before sort: " + orders);
        orders.sort(Comparator.comparingDouble(Order::getTotalAmount).thenComparing(Order::getOrderId));
        System.out.println("Order after sort: " + orders);

//        i) Write a method to filter orders with totalAmount > 50.0 and return a new list; then sort that result by customerName (A→Z) and print it.
        List<Order> list50 = new ArrayList<>();
        list50 = listMoreThan50(orders);
        System.out.println("List order with totalAmount >50 before sort: " + list50);
        list50.sort(Comparator.comparing(Order::getCustomerName).thenComparing(Order::getOrderId));
        System.out.println("List order with totalAmount >50 after sort: " + list50);
    }

    public static List<Order> listMoreThan50(List<Order> list) {
        // return new ArrayList<>(...) with totalAmount > 50.0
        List<Order> result = new ArrayList<>();
        for (Order order : list) {
            if (order.getTotalAmount() > 50) {
                result.add(order);
            }
        }
        return result;
    }

    public static List<Order> deleteOrder(List<Order> list, Order deleteOrder ) {
        if (list == null) return null;
        list.removeIf(order -> order.equals(deleteOrder));
        return list;
    }
}
