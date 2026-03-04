package TaskD;
import TaskD.DeptEmployee;
import TaskD.DeptEmployeeData;

import java.util.Arrays;
import java.util.Comparator;

public class TaskDMain {
    public static void main(String[] args) {
        DeptEmployee[] deptEmployeeData = DeptEmployeeData.getDeptData();
        //Before sort
        System.out.println("Before sort:" + Arrays.toString(deptEmployeeData));

        Arrays.sort(deptEmployeeData, new Comparator<DeptEmployee>() {

            @Override
            public int compare(DeptEmployee o1, DeptEmployee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        } );
        //After sort
        System.out.println("After sort:" + Arrays.toString(deptEmployeeData));
    }
}
