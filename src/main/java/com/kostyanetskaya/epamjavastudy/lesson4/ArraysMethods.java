package com.kostyanetskaya.epamjavastudy.lesson4;

import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 5};
        System.out.println(Arrays.toString(array));

        int[] newArray = Arrays.copyOf(array, 8);
        System.out.println(Arrays.toString(newArray));

        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = {1,2,3,4,5,6,7,8,9};
        int[] arr3 = {1,2,5,5,5,5,5,8,9};
        System.out.println(arr1 == arr2);
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.equals(arr1, arr3));

        int[] intArr = {55, 57, 61, 66, 18, 19, 27, 38,10, 55, 15, 39, 51, 18, 83, 95};
        Arrays.sort(intArr);
        System.out.println("The sorted int array is:");
        System.out.println(Arrays.toString(intArr));

        int[] intArr2 = {10, 15, 18, 18, 19, 27, 38, 39, 51, 55, 55, 57, 61, 66, 83, 95};
        int searchVal = 55;
        int retVal = Arrays.binarySearch(intArr, searchVal);
        System.out.println("The index of element 55 is : " + retVal);

        int[] array2 = new int[7];
        Arrays.fill(array, -1);
        System.out.println(Arrays.toString(array));
    }
}

class MultiDimensionalMethods {
    public static void main(String[] args) {
        int [][] array = {{1, 2, 3},{4, 5, 6}};
        System.out.println(Arrays.deepToString(array));

        int[][] array2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7 } };
        int[][] anotherArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7 } };
        System.out.println(Arrays.equals(array2, anotherArray));
        System.out.println(Arrays.deepEquals(array2, anotherArray));
    }
}

class Test {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        System.out.println(Arrays.toString(array));
    }
}
