package com.telran;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ReatedNumberFilterTest {
    ReatedNumberFilter filter = new ReatedNumberFilter();

    @Test
    public void testRemainRepeated_emptyList_emptyList() {
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, filter.remainRepeated(new ArrayList<>()));
    }

    @Test
    public void testRemainRepeated_severalNumsNoRepetitions_emptyList() {
        List<Integer> expected = new ArrayList<>();
        List<Integer> toTest = Arrays.asList(8, -10, 4, 15);
        assertEquals(expected, filter.remainRepeated(toTest));
    }

    @Test
    public void testRemainRepeated_severalNumsOneNum3Occurrences_singleNumberList() {
        List<Integer> expected = Arrays.asList(-10);
        List<Integer> toTest = Arrays.asList(8, -10, 4, -10, 15, -10);
        assertEquals(expected, filter.remainRepeated(toTest));
    }

    @Test
    public void testRemainRepeated_severalNumsOneNum3ccurrences_twoNumberList() {
        Set<Integer> expected = new HashSet<>(Arrays.asList(-10, 4));
        List<Integer> toTest = Arrays.asList(8, -10, 4, -10, 15, -10, 1, 4, 9, 4);
        assertEquals(expected, new HashSet<>(filter.remainRepeated(toTest)));
    }

}