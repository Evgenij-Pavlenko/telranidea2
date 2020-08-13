package com.telran;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CoversFinder {
    /**
     * @param numbers  sorted list of numbers
     * @param segments
     * @return the corresponding quantities of covers by segments
     */

    //если список точек неотсортированный - то сделать через Map- сделать соответствие старого индекса новому
    public List<Integer> find(List<Integer> numbers, List<Segment> segments) {
        List<Point> points = collectPoints(numbers, segments);

        List<Integer> res = new ArrayList<>();
        int currentCover = 0;
        for (Point point : points) {
            if (point.status == PointStatus.DEFAULT) {
                res.add(currentCover);
            } else if (point.status == PointStatus.LEFT) {
                currentCover++;
            } else {
                currentCover--;
            }
        }
        return res;
    }

    private List<Point> collectPoints(List<Integer> numbers, List<Segment> segments) {
        List<Point> points = numbers.stream()
                .map(num -> new Point(num, PointStatus.DEFAULT))
                .collect(Collectors.toList());

        points.addAll(segments.stream()
                .flatMap(segment -> Stream.of(
                        new Point(segment.left, PointStatus.LEFT),
                        new Point(segment.rigth, PointStatus.RIGTH)
                ))
                .collect(Collectors.toList())
        );

//        points.sort((p1, p2) -> p1.value - p2.value);
//        Collections.sort(points); //  или так сортировать
            points.sort(Point::compareTo);
        return points;
    }
}

