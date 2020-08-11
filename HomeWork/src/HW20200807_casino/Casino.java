package HW20200807_casino;

/*
Вася пришел в казино поиграть в игру, в которой за один раунд можно либо увеличить свою ставку на 1 доллар,
либо удвоить ставку, либо проиграть. Ставки можно делать целыми долларами, без центов.
 Найти минимальное количество игр, в которое надо сыграть Васе, чтобы с одного доллара дойти до N долларов,
при условии, что в игре может быть не больше M раз удвоений.
 */
public class Casino {
    /**
     * Start game with 1 USD
     *
     * @param N - winning amount
     * @param M - number of doublings
     * @return - number of games
     */
    public int minCountGame(int N, int M) {
//        //обнуляем 1 доллар)
//        if (N == 0) { // но кастыль( позже попробую через рекурсию
//            return 1;
//        }
//        int count = 0;
//        while (N > 1) {
//            if (N % 2 == 0 && M > 0) {
//                N /= 2;
//                M--;
//                count++;
//            } else {
//                N -= 1;
//                count++;
//            }
//        }
        int count = 0;
        return loopGame(N, M, count);

    }

    private int loopGame(int N, int M, int count) {
        if (N == 0) {
            return 1;
        }
        if (N % 2 == 0 && M > 0) {
            return loopGame(N / 2, M - 1, count+1);
        }
        return loopGame(N - 1, M, count+1);
    }
}