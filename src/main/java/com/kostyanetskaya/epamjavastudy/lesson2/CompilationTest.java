package com.kostyanetskaya.epamjavastudy.lesson2;

public class CompilationTest {
    public static void main(String[] args) {
        String s = "Hello";
        long l = 99L;
        double d = 1.11;
        int i = 1;
        int j = 0;
        j = i << l;

        System.out.println(j);
    }
}
