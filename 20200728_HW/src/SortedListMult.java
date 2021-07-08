import java.util.List;

// 1,3,8,9,9,11,20 -> n=33 -> true
public class SortedListMult {
    public boolean isDevided(List<Integer> list, int n) {
        for (int i = 0; i < list.size(); i++) {
            int temp = n / list.get(i);
            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(j) == temp) {
                    return true;
                }
            }
        }
        return false;
    }
}
