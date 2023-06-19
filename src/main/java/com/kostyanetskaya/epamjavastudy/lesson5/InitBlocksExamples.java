package com.kostyanetskaya.epamjavastudy.lesson5;

import java.util.Arrays;

public class InitBlocksExamples {

}
 class InitDemo5 {
    private static char[] alph;
    static {
        alph = new char[26];
        int i = 0;
        for (char c = 'a'; i < alph.length; c++, i++) {
            alph[i] = c;
        }
    }
    public static void main(String[] arg) {
        System.out.print(Arrays.toString(alph));
    }
}

class InitDemo6 {
    private int a = 5;
    private static int b = 100;
    {
        a = -5;
        System.out.println("Dynamic initialization section");
        System.out.println(b);
        System.out.println(a);
    }
    public InitDemo6() {
        a = 10;
        b = 10;
        System.out.println("Constructor");
    }
    static {
        b = -5;
        System.out.println("Static initialization section ");
        System.out.println(b);
    }
    public static void main(String[] arg) {
        System.out.println("Main");
        InitDemo6 obj = new InitDemo6();
        System.out.println("a=" + obj.a + "\tb=" + b);
    }
}

class InitDemo7 {
    private final int XX = 50;
    private final int ZZ;
    private final int YY;
    {
        ZZ = 20;
        System.out.println("Dynamic section");
    }
    public InitDemo7() {
        YY = 30;
        System.out.println("Constructor");
    }
    public static void main(String[] arg) {
        System.out.println("Main");
        InitDemo7 obj = new InitDemo7();
    }
}

