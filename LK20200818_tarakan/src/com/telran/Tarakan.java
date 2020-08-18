package com.telran;

import java.util.List;
import java.util.Random;

public class Tarakan extends Thread {

    private static final int FASTEST_STEP_TIME = 99;
    private static final int SLOWEST_STEP_TIME = 100;
    int stepNum;
    String name;
    final List<Score> scores;
    Random random = new Random();

    public Tarakan(int stepNum, String name, List<Score> scores) {
        this.stepNum = stepNum;
        this.name = name;
        this.scores = scores;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < stepNum; i++) {
            int stepLtngth = FASTEST_STEP_TIME + random.nextInt(SLOWEST_STEP_TIME - FASTEST_STEP_TIME);
            try {
                Thread.sleep(stepLtngth);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int runDuration = (int) (System.currentTimeMillis()-startTime);

        synchronized (scores){
            scores.add(new Score(name, runDuration));
        }
    }
}
