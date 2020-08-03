package com.telan;

import java.util.ArrayList;
import java.util.List;

public class PointsAtLine {
    public List<Double> findMaxPoints(List<Double> list, double L) {
        List<Double> retDoubleList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            List<Double> temp = new ArrayList<>();
            for (int j = i; j < list.size() && list.get(j) < (list.get(i) + L); j++) {
                temp.add(list.get(j));
                if (retDoubleList.size() < temp.size()) {
                    retDoubleList = temp;
                }
            }
        }
        return retDoubleList;
    }
}
