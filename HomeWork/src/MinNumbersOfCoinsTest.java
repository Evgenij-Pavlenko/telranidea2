import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinNumbersOfCoinsTest {

    MinNumbersOfCoins coins = new MinNumbersOfCoins();

    @Test
    public void testGetMinNumbersOfCoins_sum0_coins0() {
        assertEquals(0, coins.getMinNumbersOfCoins(0));
    }

    @Test
    public void testGetMinNumbersOfCoins_sum1_coins1() {
        assertEquals(1, coins.getMinNumbersOfCoins(1));
    }

    @Test
    public void testGetMinNumbersOfCoins_sum2_coins2() {
        assertEquals(2, coins.getMinNumbersOfCoins(2));
    }

    @Test
    public void testGetMinNumbersOfCoins_sum3_coins3() {
        assertEquals(3, coins.getMinNumbersOfCoins(3));
    }

    @Test
    public void testGetMinNumbersOfCoins_sum4_coins4() {
        assertEquals(4, coins.getMinNumbersOfCoins(4));
    }

    @Test
    public void testGetMinNumbersOfCoins_sum5_coins1() {
        assertEquals(1, coins.getMinNumbersOfCoins(5));
    }

    @Test
    public void testGetMinNumbersOfCoins_sum7_coins3() {
        assertEquals(3, coins.getMinNumbersOfCoins(7));
    }

    @Test
    public void testGetMinNumbersOfCoins_sum10_coins1() {
        assertEquals(1, coins.getMinNumbersOfCoins(10));
    }

    @Test
    public void testGetMinNumbersOfCoins_sum11_coins2() {
        assertEquals(2, coins.getMinNumbersOfCoins(11));
    }

    @Test
    public void testGetMinNumbersOfCoins_sum27_coins1() {
        assertEquals(5, coins.getMinNumbersOfCoins(27));
    }

}