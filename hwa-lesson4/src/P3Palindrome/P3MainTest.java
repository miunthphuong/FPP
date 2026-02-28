package P3Palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P3MainTest {

    @Test
    void isPalindrome_1() {
        assertTrue(P3Main.isPalindrome(1));
    }

    @Test
    void isPalindrome_2() {
        assertTrue(P3Main.isPalindrome(121));
    }

    @Test
    void isPalindrome_3() {
        assertTrue(P3Main.isPalindrome(5555));
    }

    @Test
    void isPalindrome_4() {
        assertTrue(P3Main.isPalindrome(3443));
    }

    @Test
    void isPalindrome_5() {
        assertTrue(P3Main.isPalindrome(0));
    }

    @Test
    void isPalindrome_6() {
        assertFalse(P3Main.isPalindrome(65));
    }

    @Test
    void isPalindrome_7() {
        assertFalse(P3Main.isPalindrome(454545));
    }

    @Test
    void isPalindrome_8() {
        assertFalse(P3Main.isPalindrome(1211));
    }
}