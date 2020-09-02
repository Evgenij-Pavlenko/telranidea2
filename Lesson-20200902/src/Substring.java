/*
1. Есть строка. Необходимо найти все подстроки, длинны К, такие, что только один символ в них встречается 2 раза.
Hello		List<String> f(int k, String s)
 */

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Substring {
    List<String> sub(int k, String s) {

        List<String> ret = new ArrayList<>();
        if (k>s.length()){
            return ret;
        }
            for (int i = 0; i <= s.length() - k; i++) {
                String sub = s.substring(i, i + k);
//                Set<Character> collect = sub.chars()
//                        .mapToObj(c -> (char) c)
//                        .collect(Collectors.toSet());
                long count = sub.chars().distinct().count();
//                if (sub.length()-collect.size()==1){
                if (sub.length()-count==1){
                    ret.add(sub);
                }
            }
        return ret;
    }
}
