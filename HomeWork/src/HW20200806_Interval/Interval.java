package HW20200806_Interval;

/*
Есть интервал чисел [a, b]
где a, b — Integer >0.
 Найти количество чисел из отрезка [a, b] такие, что их можно представить в виде x *(x+1), где х — Integer.
 */
public class Interval {
    public int getNumbersInInterval(int a, int b) {
        int count = 0;
        for (int i = 1; i * (i + 1) <= b; i++) {
            if (i * (i + 1) >= a && i*(i+1)<=b){
                count++;
            }
        }
        return count;
    }
}
