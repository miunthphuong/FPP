package P4MaxInArray;

public class P4Main {
    public static void main(String[] args) {
        int[] arr = {5, -3, 6, 1, 9, 4};
        int max = findMax(arr, arr.length - 1);
        System.out.println("Max = " + max);
    }

    public static int findMax(int[] arr, int index) {
        if (index < 0) {
            return -1;
        }
        if (index == 0) {
            return arr[0];
        }
        int previousMax = findMax(arr, index - 1);
        return Math.max(previousMax, arr[index]);
    }
}
