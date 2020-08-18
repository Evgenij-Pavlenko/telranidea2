package com.telran2;

public class IncrementingThread extends Thread {

    Incrementor incrementor;
    int times;

    public IncrementingThread(Incrementor incrementor, int times) {
        this.incrementor = incrementor;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            incrementor.increment();
            incrementor.atomicIncrement();
        }
    }
}
