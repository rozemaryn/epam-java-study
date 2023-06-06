package com.kostyanetskaya.epamjavastudy.lesson4;

public class TwoDimensionalArray {
    public static void main(String[] args) {
//        int[][] multiplicationTable = new int[5][];
//        System.out.println("multiplicationTable = " + multiplicationTable);
//        for (int i = 0; i < multiplicationTable.length; i++) {
//            System.out.println("multiplicationTable[" + i + "] = " + multiplicationTable[i]);
//        }
//        System.out.println("\nCreate array");
//        for (int i = 0; i < multiplicationTable.length; i++) {
//            multiplicationTable[i] = new int[5];
//            System.out.println("multiplicationTable[" + i + "] = " + multiplicationTable[i]);
//        }
//        System.out.println("\nInitialization array");
//        for (int i = 0; i < multiplicationTable.length; i++) {
//            for (int j = 0; j < multiplicationTable[i].length; j++) {
//                System.out.print(" " + multiplicationTable[i][j]);
//            }
//            System.out.println();
//        }

        int[][] array = {
                {1, 2, 3},
                {7, 8, 9},
                {42, 1, 6}};

        int x = array[0][2];
        System.out.println(x);
    }
}

class TestTwoDimensionalArray {
    public static void main(String[] args) {
        //NullPointerException
        int[][] array2D = new int[10][];
        array2D[0][0] = 10;

        int[][] products = {{0, 0, 0, 0, 0},
                {0, 1, 2, 3, 4},
                {0, 2, 4, 6},
                {0, 3, 6, 9, 12},
                {0, 4, 8, 12, 16}};

        int sum = 0;;

        for (int[] product : products) {
            for (int i : product) {
                sum += i;
            }
        }
        System.out.println(sum);

        String[] ejgStr = new String[][]{{null}, new String[]{"a", "b", "c"}, {new String()}}[2];
        String[] ejgStr1 = null;
        String[] ejgStr2 = { null };
        //System.out.println(ejgStr[0] + "  " + ejgStr2[0] + "  " + ejgStr1[0]);

    }
}

class MultiDimensionalArray {
    public static void main(String[] args) {
        int[] numbers = { 1, 3, 5, 7, 9 };
        int[][] array = new int[3][];
        array[0] = numbers;
        array[2] = new int[] { 2, 4, 6, 8 };

        for (int[] row : array) {
            if (row != null) {
                for (int element : row) {
                    System.out.print(element + " ");
                }
            } else {
                System.out.print(row);
            }
            System.out.println();
        }
    }
}