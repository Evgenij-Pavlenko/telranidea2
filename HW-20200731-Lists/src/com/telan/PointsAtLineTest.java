package com.telan;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PointsAtLineTest {
    PointsAtLine points = new PointsAtLine();

    @Test
    public void testFindMaxPoints_line_points() {
        List<Double> listD = Arrays.asList(1.0, 2.0, 3.0, 5.0, 6.0, 10.0, 11.0);
        List<Double> expected = Arrays.asList(1.0,2.0,3.0);
        assertEquals(expected, points.findMaxPoints(listD, 3.0));
    }

}