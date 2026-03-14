package prob2;
public class CustomerAccount {
    private String cusName;
    private String accNo;
    private double balance;

    public CustomerAccount(String cusName, String accNo, double balance) {
        this.cusName = cusName;
        this.accNo = accNo;
        this.balance = balance;
    }

//2. Deposit method (deposit(double amount))
    public boolean deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
        System.out.println("Deposit successful. Balance: $" + balance);
        return true;
    }

//1. Withdraw method (withdraw(double amount))
    public boolean withdraw(double amount) {
        // check withdraw > balance
        if (amount > balance) {
            throw new AccountException("Insufficient funds! Withdrawal amount exceeds balance.");
        }
        // check balance after withdraw < 100
        if ((balance - amount) < 100) {
            throw new AccountException("Low balance warning! Balance cannot go below $100.");
        }
        balance -= amount;
        System.out.println("Withdraw successful. Balance: $" + balance);
        return true;
    }

    public double getBalance() {
        return balance;
    }
}
