package com.telran;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NOKTest {
    NOK nok = new NOK();

    //a=b
    @Test
    public void testFindNOK_2and2_2() {
        assertEquals(2, nok.findNOK(2, 2));
    }

    //with 0
    @Test
    public void testFindNOK_0and2_0() {
        assertEquals(0, nok.findNOK(0, 2));
        assertEquals(0, nok.findNOK(2, 0));
    }

    @Test
    public void testFindNOK_1and10_10() {
        assertEquals(10, nok.findNOK(1, 10));
        assertEquals(10, nok.findNOK(10, 1));
    }

    //a*b
    @Test
    public void testFindNOK_7and13_2() {
        assertEquals(91, nok.findNOK(7, 13));
        assertEquals(91, nok.findNOK(13, 7));
    }

    @Test
    public void testFindNOK_15and25_2() {
        assertEquals(75, nok.findNOK(15, 25));
        assertEquals(75, nok.findNOK(25, 15));
    }

}