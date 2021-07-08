package HW20200806_Interval;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntervalTest {
    Interval interval = new Interval();


    @Test
    public void testGetNumbersInInterval_1And1_0() {
        assertEquals(0, interval.getNumbersInInterval(1, 1));
    }
    @Test
    public void testGetNumbersInInterval_2And2_1() {
        assertEquals(1, interval.getNumbersInInterval(2, 2));
    }
    @Test
    public void testGetNumbersInInterval_0And0_0() {
        assertEquals(0, interval.getNumbersInInterval(0, 0));
    }

    @Test
    public void testGetNumbersInInterval_2And3_1() {
        assertEquals(1, interval.getNumbersInInterval(2, 3));
    }
    @Test
    public void testGetNumbersInInterval_2And10_2() {
        assertEquals(2, interval.getNumbersInInterval(2, 10));
    }

    @Test
    public void testGetNumbersInInterval_2And20_4() {
        assertEquals(4, interval.getNumbersInInterval(2, 20));
    }

}