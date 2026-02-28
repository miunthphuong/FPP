package P2Reversing;
import java.util.Arrays;

public class P2Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 13};

        System.out.println("Before Reverse: " + Arrays.toString(arr));
        reverseData(arr);
        System.out.println("After Reverse: " + Arrays.toString(arr));
    }

    public static void reverseData(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        reverseRecursive(array, 0, array.length - 1);
    }

    private static void reverseRecursive(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverseRecursive(arr, left + 1, right - 1);
    }
}
