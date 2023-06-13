package com.kostyanetskaya.epamjavastudy.lesson4.tasks;
/*
Перейдите в класс TransposeMatrix и реализуйте метод multiply.
Метод принимает в качестве параметра прямоугольный целочисленный массив (матрицу) и возвращает его транспонированным.
Результат транспонирования матрицы – это перевернутая по главной дагонали версия исходной матрицы.
 */

import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] multiply (int[][] matrix) {
        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }
        return transposedMatrix;
    }

    public static void main(String[] args) {
        int [][] matrix = {
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8}
        };
        int [][] matrix2 = multiply(matrix);

        for (int[] ints : matrix2) {
            for (int anInt : ints) {
                System.out.printf("%4s", anInt);
            }
            System.out.println();
        }
    }

}
