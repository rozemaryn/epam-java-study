package com.kostyanetskaya.epamjavastudy.lesson4.tasks;

public class SumOfEvenNumbers {
    public static int sum (int [] array) {
        int sum = 0;

        if (array != null && array.length != 0) {
            for (int value : array) {
                if (value % 2 == 0) {
                    sum += value;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] vals = new int[]{0, 0, 0};
        int[] nullArray = null;

        int result = SumOfEvenNumbers.sum(nullArray);
        System.out.println(result);
    }
}
