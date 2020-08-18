package com.telran2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Incrementor incrementor = new Incrementor();
        Thread th1 = new IncrementingThread(incrementor, 100000);
        Thread th2 = new IncrementingThread(incrementor, 100000);
        th1.start();
        th2.start();

        th1.join();
        th2.join();

        System.out.println(incrementor.getValue());
        System.out.println(incrementor.getAtomicValue());

    }
}
