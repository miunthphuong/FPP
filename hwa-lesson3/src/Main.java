import P1ClassObjects.Address;
import P1ClassObjects.Customer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    this.p1ClassProjects();
}

// Solve the problem 1
void p1ClassProjects (){
    //Create Customer instances
    Customer cus1 = new Customer("Phuong", "Nguyen", "12345");
    Customer cus2 = new Customer("Amr", "Sami", "67890");
    Customer cus3 = new Customer("Phuong", "Nguyen", "12345");
    Customer[] cusArray = {cus1, cus2, cus3};

    //Create Address instances
    Address add1 = new Address("street 1", "Fairfield", "Iowa", "11111");
    Address add2 = new Address("street 2", "Chicago", "Illinois", "22222");
    Address add3 = new Address("street 3", "Dallas", "Texas", "33333");

    cus1.setBillingAddress(add1); // Fairfield
    cus1.setShippingAddress(add1);

    cus2.setBillingAddress(add2); // Chicago
    cus2.setShippingAddress(add2);

    cus3.setBillingAddress(add3); // Dallas
    cus3.setShippingAddress(add3);

    System.out.println("Customers with billing address in Chicago:");
    for(Customer cus: cusArray) {
        if (cus.getBillingAddress() != null && cus.getBillingAddress().getCity().equalsIgnoreCase("Chicago")) {
            System.out.println(cus.toString());
        }
    }
}
