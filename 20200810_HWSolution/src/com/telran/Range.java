package com.telran;

public class Range {
    /**
     * The method counts the qtyof all numberswhitch can be composed
     * as a multiplication of two numbers going each after another.
     * The numbers lie between a and b
     *
     * @param a lower bound
     * @param b upper bound. Muss be greater than a.
     * @return qty
     */
    public int getQtyInInterval(int a, int b) {
//        int x = 1; // einfacher => int x = Math.sqrt(a);
        int x = (int) Math.sqrt(a);

        //code below finds the first such x that x*(x+1)>=a
        while (x * (x + 1) < a){
            x++;
        }
        int res = 0;
        while (x * (x + 1) <= b){
            x++;
            res++;
        }
        return res;
    }
}
