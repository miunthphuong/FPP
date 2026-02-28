package P3Palindrome;

public class P3Main {
    public static void main(String[] args) {
        int num = 121;
        System.out.println(isPalindrome(num));
    }

    public static boolean isPalindrome(int n) {
        if (n < 0) {
            return false;
        }
        return n == reverseRecursive(n, 0);
    }

    private static int reverseRecursive(int n, int rev) {
        if (n == 0) {
            return rev;
        }
        int digit = n % 10;
        rev = rev * 10 + digit;
        return reverseRecursive(n / 10, rev);
    }
}
