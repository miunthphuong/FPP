import TaskB.DeptEmployee;
import TaskB.DeptEmployeeData;

import static TaskB.DeptEmployeeData.getDeptData;

public static void main(String[] args) {
    DeptEmployee[] deptData = getDeptData();
    System.out.println("Before Sorting: " + Arrays.toString(deptData));

    DeptEmployeeData.InnerDeptEmployeeData innerDeptData = new DeptEmployeeData.InnerDeptEmployeeData();
    Arrays.sort(deptData, innerDeptData);
    System.out.println("After Sorting: " + Arrays.toString(deptData));
}



