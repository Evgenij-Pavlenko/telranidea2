package stringSymbol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringSymbolTest {
    StringSymbol ss = new StringSymbol();

    @Test
    public void testIsCorrect_1_true() {
        String s = "[]{}()";
        assertTrue(ss.isCorrect(s));
    }

    @Test
    public void testIsCorrect_2_true() {
        String s = "[]";
        assertTrue(ss.isCorrect(s));
    }

    @Test
    public void testIsCorrect_3_true() {
        String s = "[{()}]";
        assertTrue(ss.isCorrect(s));
    }

    @Test
    public void testIsCorrect_4_true() {
        String s = "[{}()]";
        assertTrue(ss.isCorrect(s));
    }

    @Test
    public void testIsCorrect_5_false() {
        String s = "[{]}";
        assertFalse(ss.isCorrect(s));
    }

    @Test
    public void testIsCorrect_6_false() {
        String s = "[]{}((";
        assertFalse(ss.isCorrect(s));
    }

}