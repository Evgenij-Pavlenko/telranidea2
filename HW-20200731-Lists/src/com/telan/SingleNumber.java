package com.telan;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingleNumber {
    public int getUnique(List<Integer> list) {
//        Map<Integer, Integer> map;
//        map = createMap(list);
//        return renurnNumber(map);
        return renurnNumber(createMap(list));

    }

    public Map<Integer, Integer> createMap(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : list) {
            map.computeIfPresent(i, (k, v) -> v + 1);
            map.putIfAbsent(i, 1);
        }
        return map;
    }

    public int renurnNumber(Map<Integer, Integer> map) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
