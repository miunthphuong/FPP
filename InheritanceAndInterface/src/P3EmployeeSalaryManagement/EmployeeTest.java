package P3EmployeeSalaryManagement;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new CommissionEmployee("Amr", "Sami", "11111", 100, 0.1);
        employees[1] = new BasePlusCommissionEmployee("Phuong", "Nguyen", "22222", 8000, 0.05, 500);
        employees[2] = new HourlyEmployee("Steven", "Jobs", "33333", 20, 40);
        employees[3] = new SalariedEmployee("Bill", "Gate", "44444", 1200);
        employees[4] = new HourlyEmployee("Taylor", "Swift", "55555", 25, 35000);

        System.out.println("EMPLOYEE LIST:");
        for (Employee e : employees) {
            if (e != null) {
                System.out.println(e); // polymorphism
            }
        }

        System.out.println("\nEmployees with Payment < 1000:");
        Employee[] result = P3Main.findSalaryList(employees, 1000);

        for (Employee e : result) {
            System.out.println(e);
        }
    }


}