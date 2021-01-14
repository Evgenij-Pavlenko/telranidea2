package com.telran;

import java.util.ArrayList;
import java.util.List;

public class SegmentsAndPoints {
    /**
     * @param points
     * @param segments
     * @return
     */
    public List<Integer> getNumCover(List<Integer> points, List<Segment> segments) {
        List ret = new ArrayList();
        for (int point : points) {
            int count = 0;
            for (Segment segment : segments) {
                if (point >= segment.left && point <= segment.right) {
                    count++;
                }
            }
            ret.add(count);
        }
        return ret;
    }
}
