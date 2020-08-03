package com.telan;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PointsAtLineTest {
    PointsAtLine points = new PointsAtLine();

    @Test
    public void testFindMaxPoints_line_points() {
        List<Double> listDouble = Arrays.asList(1.0, 2.0, 3.0, 5.0, 6.0, 10.0, 11.0);
        List<Double> expected = Arrays.asList(1.0,2.0,3.0);
        assertEquals(expected, points.findMaxPoints(listDouble, 3.0));
    }

    @Test
    public void testFindMaxPoints_NegativeAndPozitive_points() {
        List<Double> listDouble = Arrays.asList(-7.0, -5.0, -4.0, -3.0, -1.0, 2.0, 3.0, 5.0, 6.0, 10.0, 11.0);
        List<Double> expected = Arrays.asList(-5.0,-4.0,-3.0);
        assertEquals(expected, points.findMaxPoints(listDouble, 3.0));
    }

}