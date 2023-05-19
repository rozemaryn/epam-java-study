package com.kostyanetskaya.epamjavastudy.lesson3;

public class LearnMainFor {
    public static void main(String[] args) {
        for (int i = 0, j = 0; i < 10 && j > -10; j--, i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i + " " + j);
        }
    }
}
