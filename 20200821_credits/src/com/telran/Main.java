package com.telran;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Result> resultList = new ArrayList<>();
        Thread masha = new StandardEmployee(100,150,
                "Masha",
                20,
                resultList);
        Thread petja = new StandardEmployee(100,200,
                "Petja",
                20,
                resultList);
        Thread vasja = new LasyInspiredEmployee(200,300,
                "Vasja",
                20,
                resultList,
                100,
                150,
                30);

        masha.start();
        petja.start();
        vasja.start();

        masha.join();
        petja.join();
        vasja.join();

        for (Result result: resultList){
            String toPrint = String.format("The employee %s completed the program for %d",
                    result.name, result.time);
            System.out.println(toPrint);
        }
    }
}
