/*
Есть сумма денег. Есть монеты: 10, 5, 1 $. Найти минимальное количество монет, чтобы собрать эту сумму.

7= 5+1+1;
27=10+10+5+1+1;
 */

public class MinNumbersOfCoins {

    /**
     * coins - 10,5 oder 1.
     *
     * @param sum - int > 0
     * @return minimum numbers of coins
     */
    public int getMinNumbersOfCoins(int sum) {
        if (sum == 0) {
            return 0;
        }
        if (sum >= 10) {
            return getMinNumbersOfCoins(sum - 10)+1;
        } else if (sum >= 5 && sum < 10) {
            return getMinNumbersOfCoins(sum - 5)+1;
        } else {
            return getMinNumbersOfCoins(sum - 1)+1;
        }
    }
}
