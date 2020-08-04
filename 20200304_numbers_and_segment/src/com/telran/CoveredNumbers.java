package com.telran;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class CoveredNumbers {
    /**
     * The methodcounts the max number of covered number by a segment of the length L
     * @param numbers soted list
     * @param L positive double numbers
     * @return max covered points
     */
    public int getMaxCoveredNumbers(List<Double> numbers, double L){
int res = 0;
        Deque<Double> segment = new ArrayDeque<>();

        for (double number: numbers){
            double left = number - L;
            segment.addLast(number);

            while (segment.getFirst()< left){
                segment. removeFirst();

                if (segment.size()>res){
                    res = segment.size();
                }
            }
        }
        return res;
    }
}
