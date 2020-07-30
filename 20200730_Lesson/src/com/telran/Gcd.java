package com.telran;


public class Gcd {

    /**
     * The function evaluetes GSD of two number
     *
     * @param a must be positive number
     * @param b must be positive number
     * @return greatest ...
     */
    public int countGcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        //magic - ooo! I undestand))
        //a=1*b+d
        //9=1*6+3
        //6=0*9+6
        int d = a % b;
        return countGcd(b, d);
    }
}
