package com.kostyanetskaya.epamjavastudy.lesson1;

public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 60;
        int b = 13;
        System.out.println("a & b   = " + (a & b));
        System.out.println("a | b   = " + (a | b));
        System.out.println("a ^ b   = " + (a ^ b));
        System.out.println("~a      = " + ~a);
        System.out.println("a << 2  = " + (a << 2));
        System.out.println("a >> 2  = " + (a >> 2));
        System.out.println("a >>> 2 = " + (a >>> 2));
        int c = 50;
        System.out.println(c << 3);
        System.out.println(c >> 3);
    }
}
