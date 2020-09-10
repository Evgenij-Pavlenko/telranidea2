package ChangeCase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChangeCaseTest {
    ChangeCase cc = new ChangeCase();

    @Test
    public void testChangeCase_small_big() {
        String start = "abc";
        String expected = "ABC";
        assertEquals(expected, cc.changeCase(start));
    }

    @Test
    public void testChangeCase_big_small() {
        String start = "ABC";
        String expected = "abc";
        assertEquals(expected, cc.changeCase(start));
    }

    @Test
    public void testChangeCase_smallAndOther_bigAndOther() {
        String start = "a!@#bc";
        String expected = "A!@#BC";
        assertEquals(expected, cc.changeCase(start));
    }

    @Test
    public void testChangeCase_empty_empty() {
        String start = "";
        String expected = "";
        assertEquals(expected, cc.changeCase(start));
    }

    @Test
    public void testChangeCase_smallAndBig_bigAndSmall() {
        String start = "abcABC";
        String expected = "ABCabc";
        assertEquals(expected, cc.changeCase(start));
    }

    @Test
    public void testChangeCase_smallBigOther_bigSmallOther() {
        String start = "abc*ABC";
        String expected = "ABC*abc";
        assertEquals(expected, cc.changeCase(start));
    }

    @Test
    public void testChangeCase_other_other() {
        String start = "!@#$%";
        String expected = "!@#$%";
        assertEquals(expected, cc.changeCase(start));
    }

    @Test
    public void testChangeCase_allAndSpase_allAndSpase() {
        String start = "abc ABC";
        String expected = "ABC abc";
        assertEquals(expected, cc.changeCase(start));
    }


}