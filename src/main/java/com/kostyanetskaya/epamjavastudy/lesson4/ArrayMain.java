package com.kostyanetskaya.epamjavastudy.lesson4;

public class ArrayMain {
    public static void main(String[] args) {
        int[] array;
        int[] arrayInt = new int[100];
        int[] amountDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("Апрель содержит " + amountDays[3] + " дней");
        for (int i = 0; i < amountDays.length; i++) {
            if (amountDays[i] < 31) {
                amountDays[i] = 0;
            }
            arrayInt[i] = amountDays[i];
        }
        array = amountDays;
    }
}

