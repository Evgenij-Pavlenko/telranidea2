import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromTest {
    Palindrom palindrom = new Palindrom();

    @Test
    public void testIsPalindrom_1num_true() {
        assertTrue(palindrom.isPalindrom(1));
    }

    @Test
    public void testIsPalindrom_2numSame_true() {
        assertTrue(palindrom.isPalindrom(11));
    }

    @Test
    public void testIsPalindrom_2numNotSame_false() {
        assertFalse(palindrom.isPalindrom(12));
    }

    @Test
    public void testIsPalindrom_3numSame_true() {
        assertTrue(palindrom.isPalindrom(111));
    }

    @Test
    public void testIsPalindrom_3numNotSame_false() {
        assertFalse(palindrom.isPalindrom(123));
    }

    @Test
    public void testIsPalindrom_3numPalindr_true() {
        assertTrue(palindrom.isPalindrom(121));
    }

}