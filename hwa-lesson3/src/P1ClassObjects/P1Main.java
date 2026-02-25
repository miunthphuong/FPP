package P1ClassObjects;

public class P1Main {
    void main()
    {
        display();
    }

    public void display(){
        //Create Customer instances
        Customer cus1 = new Customer("Phuong", "Nguyen", "12345");
        Customer cus2 = new Customer("Amr", "Sami", "67890");
        Customer cus3 = new Customer("Steven", "Jobs", "11111");
        Customer[] cusArray = {cus1, cus2, cus3};

        //Create Address instances
        Address add1 = new Address("street 1", "Fairfield", "Iowa", "11111");
        Address add2 = new Address("street 2", "Chicago", "Illinois", "22222");
        Address add3 = new Address("street 3", "Dallas", "Texas", "33333");

        cus1.setBillingAddress(add1); // Fairfield
        cus2.setBillingAddress(add2); // Chicago
        cus3.setBillingAddress(add3); // Dallas

        System.out.println("Customers with billing address in Chicago:");
        for(Customer cus: cusArray) {
            if (cus.getBillingAddress() != null && cus.getBillingAddress().getCity().equalsIgnoreCase("Chicago")) {
                System.out.println(cus.toString());
            }
        }
    }
}
