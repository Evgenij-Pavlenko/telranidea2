package HW20200304_isLovely;

import java.util.*;
import java.util.stream.Collectors;

public class IsLovely {
    /**
     * @param number
     * @return boolean
     */
    boolean isLovely(long number) {
        // variant one
//        Map<Integer, Integer> map = new HashMap<>();
//        do {
//            int key = (int) (number % 10);
//            map.computeIfPresent(key, (k, v) -> v + 1);
//            map.putIfAbsent(key, 1);
//            if (map.get(key) > 2) {
//                System.out.println(map.get(key));
//                return false;
//            }
//            number /= 10;
//        } while (number != 0);
//        return true;

        //variant two - stream
        List<Integer> list = new ArrayList<>();
        do {
            list.add((int) (number % 10));
            number /= 10;
        } while (number != 0);
//        list.sort(Integer::compareTo);
        boolean b = list.stream()
                .collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()))
                .values()
                .stream()
                .anyMatch(v -> v > 2);
        return !b;
    }
}
