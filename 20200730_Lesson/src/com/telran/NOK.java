package com.telran;

import java.util.List;

public class NOK {
    Gcd gcd = new Gcd();

    public int findNOK(int a, int b) {
        int ret = (a * b) / gcd.countGcd(a, b);
        return ret;
    }
}
