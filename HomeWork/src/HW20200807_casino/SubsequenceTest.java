package HW20200807_casino;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubsequenceTest {
    Subsequence subsequence = new Subsequence();

    @Test
    public void testIsSubsequence_StringSubstring_true() {
        String first = "bcd";
        String second = "A$%bGDFcLKKd";
        assertTrue(subsequence.isSubsequence(first, second));
    }

    @Test
    public void testIsSubsequence_StringSubstring_false() {
        String first = "bcd";
        String second = "A$%bGDFcLKK";
        assertFalse(subsequence.isSubsequence(first, second));
    }

    @Test
    public void testIsSubsequence_StringEmptySubstring_true() {
        String first = "";
        String second = "A$%bGDFcLKK";
        assertTrue(subsequence.isSubsequence(first, second));
    }

    @Test
    public void testIsSubsequence_StringSubstringEmpty_false() {
        String first = "bcd";
        String second = "";
        assertFalse(subsequence.isSubsequence(first, second));
    }

    @Test
    public void testIsSubsequence_StringAndSameSubstring_true() {
        String first = "bcd";
        String second = "bcd";
        assertTrue(subsequence.isSubsequence(first, second));
    }

    @Test
    public void testIsSubsequence_StringDoubleSymbolSubstring_false() {
        String first = "bccd";
        String second = "A$%bGDFcLKKd";
        assertFalse(subsequence.isSubsequence(first, second));
    }

    @Test
    public void testIsSubsequence_StringSubstringDoubleSymbol_true() {
        String first = "bcd";
        String second = "A$%bGDFcLcKKd";
        assertTrue(subsequence.isSubsequence(first, second));
    }

    @Test
    public void testIsSubsequence_StringDoubleSymbolSubstringDoubleSymbol_true() {
        String first = "bccd";
        String second = "A$%bGDFcLcKKd";
        assertTrue(subsequence.isSubsequence(first, second));
    }

    @Test
    public void testIsSubsequence_StringDoubleSymbolSubstringDoubleSymbolBeside_true() {
        String first = "bccd";
        String second = "A$%bGDFccLKKd";
        assertTrue(subsequence.isSubsequence(first, second));
    }

}