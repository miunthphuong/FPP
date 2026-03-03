package P3EmployeeSalaryManagement;

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate; // percentage

    public CommissionEmployee(String firstName, String lastName, String ssn,
                              double grossSales, double commissionRate) {
        super(firstName, lastName, ssn);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double getPayment() {
        return grossSales * commissionRate;
    }
}