package com.kostyanetskaya.epamjavastudy.lesson4.tasks;

public class Spiral {

    /*
    Перейдите в класс Spiral и реализуйте его статический метод:
    int[][] spiral(int rows, int columns)

    Возвращает двумерный массив в виде таблицы, содержащий числа от 1 до rows * columns.
    Размер таблицы будет определяться заданными параметрами.
    Числа заполняют "таблицу" по часовой стрелке от верхнего угла по спирали.
    Например, для значений параметров (3, 4), выходной массив должен быть:
    1  2  3  4
    10 11 12  5
    9  8  7  6
     */
    public static int[][] spiral(int rows, int columns) {
        int[][] array = new int[rows][columns];

        int i = 0;
        int j = 0;
        int number = 1;
        int firstCounter = -1;
        int secondCounter = 0;
        int maxNumber = rows * columns;

        do {
            while (j < columns) {
                array[i][j] = number;
                j++;
                number++;
            }

            i++;
            j--;
            columns--;

            while (i < rows) {
                array[i][j] = number;
                i++;
                number++;
            }
            i--;
            j--;
            rows--;

            if (number <= maxNumber) {

                while (j > firstCounter) {
                    array[i][j] = number;
                    j--;
                    number++;
                }
            }

            j++;
            firstCounter++;
            i--;

            while (i > secondCounter) {
                array[i][j] = number;
                i--;
                number++;
            }
            j++;
            secondCounter++;
            i++;
        }

        while (columns > 1);

        return array;
    }

    public static void main(String[] args) {
        int[][] spiral = Spiral.spiral(2, 2);

        for (int[] ints : spiral) {
            for (int anInt : ints) {
                System.out.printf("%4s", anInt);
            }
            System.out.println();
        }
    }
}
