package com.telran;

import java.util.List;

public class LasyInspiredEmployee extends StandardEmployee {
    int inspiredShortest;
    int inspiredLongest;
    int inspirationProbability;

    public LasyInspiredEmployee(int fastestDecisionTime,
                                int longestDecisionTime,
                                String name,
                                int creditNumber,
                                List<Result> resultList,
                                int inspiredShortest,
                                int inspiredLongest,
                                int inspirationProbability) {
        super(fastestDecisionTime, longestDecisionTime, name, creditNumber, resultList);
        this.inspiredShortest = inspiredShortest;
        this.inspiredLongest = inspiredLongest;
        this.inspirationProbability = inspirationProbability;
    }

    @Override
    public void run() {
        long startingTime = System.currentTimeMillis();

        int inspiredCreditsLeft = 0;
        for (int i = 0; i < creditNumber; i++) {
            int creditTime;
            if (inspiredCreditsLeft == 0 && rnd.nextInt(100) < inspirationProbability) {
                inspiredCreditsLeft = 3;
            }
            if (inspiredCreditsLeft > 0) {
                creditTime = rnd.nextInt(inspiredLongest - inspiredShortest) + inspiredShortest;
                inspiredCreditsLeft--;
            } else {
                creditTime = rnd.nextInt(longestDecisionTime - shortestDecisionTime) + shortestDecisionTime;
            }
            try {
                Thread.sleep(creditTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long endingTime = System.currentTimeMillis();
        synchronized (resultList) {
            resultList.add(new Result(name, (int) (endingTime - startingTime)));
        }
    }
}
