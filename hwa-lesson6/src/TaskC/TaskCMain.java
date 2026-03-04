import TaskC.DeptEmployee;
import TaskC.DeptEmployeeData;

import java.util.Arrays;

public static void main(String[] args) {
        DeptEmployee[] deptEmployee = DeptEmployeeData.getDeptData();
        System.out.println("Before Sorting: " + Arrays.toString(deptEmployee));
        DeptEmployeeData.mySortFunction(deptEmployee);
        System.out.println("After Sorting: " + Arrays.toString(deptEmployee));

}

