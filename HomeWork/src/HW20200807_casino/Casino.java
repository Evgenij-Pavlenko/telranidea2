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
//
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
        if (N == 0) { // все равно костыль( - или это норм?
            return 1;
        }
        return loopGame(N, M);

    }

    private int loopGame(int N, int M) {
        if (N == 0) {
            return 0;
        } else if (N == 1) {
            return loopGame(N - 1, M);
        }
        if (N % 2 == 0 && M > 0) {
            return loopGame(N / 2, M - 1) + 1;
        }
        return loopGame(N - 1, M)+1;
    }
}