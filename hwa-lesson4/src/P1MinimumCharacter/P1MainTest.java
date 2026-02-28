package P1MinimumCharacter;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class P1MainTest {
    @org.junit.jupiter.api.Test
    void findMinCharacter_1() {
        String input = "MinString";
        char result = P1Main.findMinCharacter(input, 0);
        char expectResult = 'M';
        assertEquals(expectResult, result);
    }

    @org.junit.jupiter.api.Test
    void findMinCharacter_2() {
        String input = "akel";
        char result = P1Main.findMinCharacter(input, 0);
        char expectResult = 'a';
        assertEquals(expectResult, result);
    }

    @org.junit.jupiter.api.Test
    void findMinCharacter_3() {
        String input = "13213214sdfdsfsd";
        char result = P1Main.findMinCharacter(input, 0);
        char expectResult = '1';
        assertEquals(expectResult, result);
    }

    @org.junit.jupiter.api.Test
    void findMinCharacter_4() {
        String input = "  24132@%dfads~~dfsd";
        char result = P1Main.findMinCharacter(input, 0);
        char expectResult = ' ';
        assertEquals(expectResult, result);
    }

    @org.junit.jupiter.api.Test
    void findMinCharacter_5() {
        String input = "";
        char result = P1Main.findMinCharacter(input, 0);
        char expectResult = '\u0000';
        assertEquals(expectResult, result);
    }
}