package HW20200304_isLovely;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
2. Есть List<Integer> напр.{8, 0, 3, -3, 10, -5, -1}. Требуется вернуть новый лист, составленный  из старого
 следующим образом: все отрицательные числа идут налево, все положительные и 0 — идут направо.
  При этом все числа должны сохранять порядок вхождения → {-3, -5, -1, 8, 0, 3, 10}
 */
public class ListPlusMinus {
    public List<Integer> saparateInteger(List<Integer> numbers) {
        List<Integer> minus = new ArrayList<>();
        List<Integer> plus = new ArrayList<>();
        //c int быстрее работать, но каждый раз Wrap and UnWrap - как быстрее?
        // egal
        for (int i : numbers) {
            if (i < 0) {
                minus.add(i);
            } else {
                plus.add(i);
            }
        }
        minus.addAll(plus);
        return minus;
    }

}
