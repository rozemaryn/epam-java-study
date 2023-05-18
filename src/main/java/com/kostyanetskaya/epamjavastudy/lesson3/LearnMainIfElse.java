package com.kostyanetskaya.epamjavastudy.lesson3;

public class LearnMainIfElse {
    public static void main(String[] args) {
        int x = 1;
        int y = 10;
        int result;

        if (x > y) {
            result = 1;
        }
        else if (x == y) {
            result = 0;
        }
        else {
            result = 1;
        }
        System.out.println(result);
    }
}
