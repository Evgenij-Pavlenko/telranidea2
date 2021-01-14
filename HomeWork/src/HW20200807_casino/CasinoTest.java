package HW20200807_casino;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CasinoTest {

    Casino casino = new Casino();

    @Test
    public void testMinCountGame_1Winning1Doublings_0Games() {
        assertEquals(0, casino.minCountGame(1, 1));
    }

    @Test
    public void testMinCountGame_0Winning0Doublings_1Games() {
        assertEquals(1, casino.minCountGame(0, 0));
    }

    @Test
    public void testMinCountGame_2Winning0Doublings_1Games() {
        assertEquals(1, casino.minCountGame(2, 0));
    }

    @Test
    public void testMinCountGame_2Winning1Doublings_1Games() {
        assertEquals(1, casino.minCountGame(2, 1));
    }

    @Test
    public void testMinCountGame_2Winning2Doublings_1Games() {
        assertEquals(1, casino.minCountGame(2, 2));
    }

    @Test
    public void testMinCountGame_7Winning2Doublings_4Games() {
        assertEquals(4, casino.minCountGame(7, 2));
    }

    @Test
    public void testMinCountGame_8Winning1Doublings_4Games() {
        assertEquals(4, casino.minCountGame(8, 1));
    }

}