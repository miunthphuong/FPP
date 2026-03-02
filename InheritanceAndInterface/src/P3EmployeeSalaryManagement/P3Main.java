package P3EmployeeSalaryManagement;

public class P3Main {
    public static void main(String[] args) {}

    public static Employee[] findSalaryList(Employee[] col, double salary) {

        if (col == null) {
            return new Employee[0];
        }
        int count = 0;
        for (Employee e : col) {
            if (e != null && e.getPayment() < salary) {
                count++;
            }
        }
        Employee[] result = new Employee[count];
        int index = 0;
        for (Employee e : col) {
            if (e != null && e.getPayment() < salary) {
                result[index++] = e;
            }
        }
        return result;
    }
}
