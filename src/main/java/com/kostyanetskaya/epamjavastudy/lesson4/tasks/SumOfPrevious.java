package com.kostyanetskaya.epamjavastudy.lesson4.tasks;

import java.util.Arrays;

public class SumOfPrevious {

    /*
    Правильная реализация должна получить массив значений int и вернуть массив логических значений,
    где каждый элемент является результатом проверки: является ли соответствующий исходный элемент
    суммой двух предыдущих элементов в данном массиве.

    Подробности:
    1) Гарантируется, что длина данного массива составляет 2 или более.
    2) Данный массив гарантированно не равен null.
    3) Метод возвращает массив логических значений, где каждый элемент является результатом для
    соответствующего элемента в данном массиве.
    4) Первые два элемента логического массива всегда false.
     */

    public static boolean[] getSumCheckArray (int[] array) {
        boolean[] verifySum = new boolean[array.length];
        Arrays.fill(verifySum,false);

        for (int i = 2; i < array.length; i++) {
            if (array[i] == array[i-2] + array[i-1]) {
                verifySum[i] = true;
            }
            else verifySum[i] = false;
        }
        return verifySum;
    }

    public static void main(String[] args) {
        boolean[] verify = getSumCheckArray(new int[] {1, -1, 0, 4, 6, 10, 15, 25});
        System.out.println(Arrays.toString(verify));
    }
}
