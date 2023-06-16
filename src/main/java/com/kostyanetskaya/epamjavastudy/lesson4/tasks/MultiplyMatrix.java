package com.kostyanetskaya.epamjavastudy.lesson4.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiplyMatrix {
    /*
    Перейдите в класс MultiplyMatrix и реализуйте метод multiply.
    Метод берет два прямоугольных целочисленных массива (матрицы) и возвращает результат их умножения.
    Рассмотрим две целочисленные матрицы, представленные в виде прямоугольных массивов.
    Задача – перемножить данные матрицы. При таком умножении элементы в i-й строке матрицы A
    умножаются на соответствующие элементы в j-м столбце матрицы B, а сумма полученных значений
    сохраняется в ij-й элемент результирующей матрицы.

    Обратите внимание, что количество столбцов в первой матрице равно количеству строк во второй матрице.
     */
    public static int[][] multiply(int[][] array1, int[][] array2) {
        int[][] result = new int[array1.length][array1[0].length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                for (int k = 0; k < array2.length; k++) {
                    result[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] array1 = {{1, 2, 3},
                {4, 5, 6}};

        int[][] array2 = {{7, 8},
                {9, 10},
                {11, 12}};

        int[][] result = multiply(array1, array2);
        System.out.println(Arrays.deepToString(result));
    }
}


