package TaskE;
import TaskE.DeptEmployee;
import TaskE.DeptEmployeeData;

import java.util.Arrays;

public class TaskEMain {
    public static void main(String[] args) {
        DeptEmployee[] data = DeptEmployeeData.getDeptData();
        //Before sort;
        System.out.println("Before sort:" + Arrays.toString(data));
        Arrays.sort(data, (DeptEmployee p1, DeptEmployee p2) -> p1.getHireDate().compareTo(p2.getHireDate()));
        System.out.println("After sort by Hire Date:" + Arrays.toString(data));
        Arrays.sort(data, (DeptEmployee p1, DeptEmployee p2) -> p1.getName().compareTo(p2.getName()));
        System.out.println("After sort by name:" + Arrays.toString(data));
        Arrays.sort(data, (DeptEmployee p1, DeptEmployee p2) -> Double.compare(p1.getSalary(), p2.getSalary()));
        System.out.println("After sort by salary:" + Arrays.toString(data));

    }
}
