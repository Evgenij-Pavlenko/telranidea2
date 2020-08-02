package com.telan;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingleNumber {
    public int getUnique(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : list) {
            map.computeIfPresent(i, (k, v) -> v + 1);
            map.putIfAbsent(i, 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry);
            if (entry.getValue() % 2 != 0) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
