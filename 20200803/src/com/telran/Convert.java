package com.telran;

public class Convert {
    public static void main(String[] args) {
        Convert conv = new Convert();
        System.out.println(conv.fromIntToByte(2));
    }

    public StringBuilder fromIntToByte(int num) {
        StringBuilder sb = new StringBuilder();
        do {
            sb.append(num % 2);
            num /= 2;
        } while (num != 0);
            sb.reverse();
        return sb;
    }
}
