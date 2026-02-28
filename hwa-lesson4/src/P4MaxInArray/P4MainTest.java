package P4MaxInArray;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class P4MainTest {
    @Test
    public void findMax_1() {
        int[] arr = {5, -3, 6, 1, 9, 4};
        int result = P4Main.findMax(arr, arr.length - 1);
        int expectResult = 9;
        assertEquals(expectResult, result);
    }

    @Test
    public void findMax_2() {
        int[] arr = {-5, -3};
        int result = P4Main.findMax(arr, arr.length - 1);
        int expectResult = -3;
        assertEquals(expectResult, result);
    }

    @Test
    public void findMax_3() {
        int[] arr = {5};
        int result = P4Main.findMax(arr, arr.length - 1);
        int expectResult = 5;
        assertEquals(expectResult, result);
    }

    @Test
    public void findMax_4() {
        int[] arr = {};
        int result = P4Main.findMax(arr, arr.length - 1);
        int expectResult = -1;
        assertEquals(expectResult, result);
    }

    @Test
    public void findMax_5() {
        int[] arr = {0, 0, 0, 0};
        int result = P4Main.findMax(arr, arr.length - 1);
        int expectResult = 0;
        assertEquals(expectResult, result);
    }
}