package prob2;

public class CustomerAccountTest {
    public static void main(String[] args) {
        CustomerAccount acc = new CustomerAccount("Customer name1", "Cus No 1", 500.0);

        // 1. Deposit negative
        try {
            acc.deposit(-10);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // 2. Withdraw more than balance
        try {
            acc.withdraw(1000);
        } catch (AccountException e) {
            System.out.println(e.getMessage());
        }

        // 3. Withdraw causing balance < 100
        try {
            acc.withdraw(450);
        } catch (AccountException e) {
            System.out.println(e.getMessage());
        }

        // 4. Successful operations
        try {
            acc.deposit(2000);
            acc.withdraw(300);
        } catch (AccountException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Final Balance: $" + acc.getBalance());
    }
}
