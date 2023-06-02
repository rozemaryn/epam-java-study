package com.kostyanetskaya.epamjavastudy.lesson4.tasks;

public class MaxMethod {
    public static int max (int [] array) {
     int max = array[0];
     for (int value: array) {
         if (max < value) {
             max = value;
         }
     }
     return max;
    }
    public static void main(String[] args) {
        int[] vals = new int[]{ -2, 0, 10, 5 };
        int result = MaxMethod.max(vals);
        System.out.println(result);
    }
}
