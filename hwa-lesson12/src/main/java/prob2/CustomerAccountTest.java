package prob2;

public class CustomerAccountTest {
    public static void main(String[] args) {
        CustomerAccount acc = new CustomerAccount("Customer name1", "Cus No 1", 500.55);
        // 1. Deposit negative
        try {
            acc.deposit(-10.23);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // 2. Withdraw more than balance
        try {
            acc.withdraw(1000.02);
        } catch (AccountException e) {
            System.out.println(e.getMessage());
        }

        // 3. Withdraw causing balance < 100
        try {
            acc.withdraw(450.13);
        } catch (AccountException e) {
            System.out.println(e.getMessage());
        }

        // 4. Successful operations
        try {
            acc.deposit(200.20);
            acc.withdraw(300.00);
        } catch (AccountException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Final Balance: $" + acc.getBalance());
    }
}
