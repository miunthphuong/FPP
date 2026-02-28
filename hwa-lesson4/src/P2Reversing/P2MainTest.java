package P2Reversing;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class P2MainTest {
    @Test
    void reverseData_test1() {
        int[] arrBefore = {1, 3, 5, 7, 9, 13};
        String result = Arrays.toString(P2Main.reverseData(arrBefore));
        String expectResult = "[13, 9, 7, 5, 3, 1]";
        assertEquals(expectResult, result);
    }

    @Test
    void reverseData_test2() {
        int[] arrBefore = {1, 3, 7, 2, 8};
        String result = Arrays.toString(P2Main.reverseData(arrBefore));
        String expectResult = "[8, 2, 7, 3, 1]";
        assertEquals(expectResult, result);
    }

    @Test
    void reverseData_test3() {
        int[] arrBefore = {};
        String result = Arrays.toString(P2Main.reverseData(arrBefore));
        String expectResult = "[]";
        assertEquals(expectResult, result);
    }

    @Test
    void reverseData_test4() {
        int[] arrBefore = {-1, 3, -7, 2, 8};
        String result = Arrays.toString(P2Main.reverseData(arrBefore));
        String expectResult = "[8, 2, -7, 3, -1]";
        assertEquals(expectResult, result);
    }

    @Test
    void reverseData_test5() {
        int[] arrBefore = {-10};
        String result = Arrays.toString(P2Main.reverseData(arrBefore));
        String expectResult = "[-10]";
        assertEquals(expectResult, result);
    }
}