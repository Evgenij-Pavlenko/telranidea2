package com.telan;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {

    SingleNumber single = new SingleNumber();

    @Test
    public void testGetUniqe_listWith1_1() {
        List<Integer> list = Arrays.asList(2, 2, 1, 3, 4, 4, 3, 2, 2);
        assertEquals(1, single.getUnique(list));
    }

    @Test
    public void testGetUniqe_listWith5_5() {
        List<Integer> list = Arrays.asList(5, 5, 5);
        assertEquals(5, single.getUnique(list));
    }

    @Test
    public void testGetUniqe_listWithTwo5_0() {
        List<Integer> list = Arrays.asList(5, 5, 5, 5);
        assertNotEquals(5, single.getUnique(list));
    }

    @Test
    public void testGetUniqe_listWith5and32_0() {
        List<Integer> list = Arrays.asList(5, 5, 5, 32);
        assertNotEquals(5+32, single.getUnique(list));
    }
}