package com.kostyanetskaya.epamjavastudy.lesson1;

public class LearnArithmetic {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b  = " + (a + b));
        System.out.println("a - b  = " + (a - b));
        System.out.println("a * b  = " + a * b);
        System.out.println("b / a  = " + b / a);
        System.out.println("b % a  = " + b % a);
        System.out.println("c % a  = " + c % a);
        int var10001 = a++;
        System.out.println("a++    = " + var10001);
        var10001 = a--;
        System.out.println("a--    = " + var10001);
        int var5 = d++;
        System.out.println("d++    = " + var5);
        ++d;
        System.out.println("++d    = " + d);
        var10001 = a += b;
        System.out.println("a += b = " + var10001);
        System.out.println("a      = " + a);
        var10001 = a -= b;
        System.out.println("a -= b = " + var10001);
        System.out.println("a      = " + a);
    }
}
