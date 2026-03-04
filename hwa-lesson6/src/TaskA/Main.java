import TaskA.DeptEmployee;
import TaskA.DeptEmployeeData;
import TaskA.NameComparator;

static void main() {
    DeptEmployee[] data = DeptEmployeeData.getDeptData();

    System.out.println("Before sorting: " + Arrays.toString(data));
    NameComparator nc = new NameComparator();
    Arrays.sort(data, nc);
    System.out.println("After sorting: " + Arrays.toString(data));

}