package P1MinimumCharacter;

public class P1Main {
    public static void main(String[] args) {
        String input = "MinString";
        char result = findMinCharacter(input, 0);
        System.out.println("The minimum character in the string \"" + input + "\" is: '" + result + "'");
    }

    public static char findMinCharacter(String str, int index) {
        if (str.isEmpty()) {
            return '\u0000';
        }
        if (index == str.length() - 1) {
            return str.charAt(index);
        }
        
        char minRemainder = findMinCharacter(str, index + 1);

        if (str.charAt(index) < minRemainder) {
            return str.charAt(index);
        } else {
            return minRemainder;
        }
    }

}
