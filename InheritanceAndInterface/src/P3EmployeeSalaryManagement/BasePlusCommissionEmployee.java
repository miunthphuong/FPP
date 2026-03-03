package P3EmployeeSalaryManagement;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String ssn,
                                      double grossSales, double commissionRate,
                                      double baseSalary) {
        super(firstName, lastName, ssn, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    public double getPayment() {
        return baseSalary + super.getPayment();
    }
}
