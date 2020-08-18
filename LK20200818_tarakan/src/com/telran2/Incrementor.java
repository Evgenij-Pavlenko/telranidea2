package com.telran2;

import java.util.concurrent.atomic.AtomicInteger;

public class Incrementor {
    int value;

    AtomicInteger atomicValue = new AtomicInteger();
    public synchronized void increment(){
//        synchronized (this){
            value++;
//        }
    }

    public void atomicIncrement(){
        atomicValue.incrementAndGet();
    }
    public int getValue(){
        return value;
    }

    public AtomicInteger getAtomicValue() {
        return atomicValue;
    }
}
