package com.telran;

public class Casino {
    /**
     * the method finds the least number of steaps neededto
     * N dollars from 1 dollar, if by one step Vasja can
     * add 1 dollar or double his current ballance
     *
     * @param N>0 the ballance to reach
     * @param M>= max number of doubling the ballance
     * @return min possible number of steps
     */
    public int getNumberOptimalSteps(int N, int M) {

        if (N == 1) {
            return 0;
        }

        if (N % 2 == 0 && M > 0) {
            return 1 + getNumberOptimalSteps(N / 2, M - 1);
        }
        return 1 + getNumberOptimalSteps(N - 1, M);
    }
}
