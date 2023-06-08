package com.kostyanetskaya.epamjavastudy.lesson4.tasks;

import java.util.Arrays;

public class LocalMaximaRemove {
    public static int[] removeLocalMaxima(int[] array) {
        int[] withoutMaxima = new int[array.length];
        boolean hasMaxima = false;
        int counter = -1;

        for (int i = 0; i <= array.length - 1; i++) {
            if (i == 0) {
                if (array[0] <= array[1]) {
                    withoutMaxima[0] = array[0];
                    hasMaxima = true;
                    counter++;
                }
            } else if (i < array.length - 1) {
                if (array[i] <= array[i - 1] || array[i] <= array[i + 1]) {
                    withoutMaxima[++counter] = array[i];
                    hasMaxima = true;
                }
            } else if (i == array.length-1) {
                if (array[i] <= array[i - 1]) {
                    withoutMaxima[++counter] = array[i];
                    hasMaxima = true;
                }
            }
        }
        if (!hasMaxima) {
            withoutMaxima = array;
        }
        int[] finalArr = new int[++counter];
        System.arraycopy(withoutMaxima,0, finalArr, 0, counter);

        return finalArr;
    }

    public static void main(String[] args) {

        int[] array = new int[1000];
        Arrays.fill(array, 15);
        array[0] = 20;
        array[999] = 25;
        array[168] = 30;
        int [] actual = LocalMaximaRemove.removeLocalMaxima(array);
        System.out.println(Arrays.toString(actual));

        System.out.println(actual.length);
        System.out.println(actual[0]);
        System.out.println(actual[996]);

//        int[] arr = removeLocalMaxima(new int[]{18, 1, 3, 6, 7, -5});
//        System.out.println(Arrays.toString(arr));
    }
}

class MaximaRemove {
    /*
    failing due to NullPointerException
     */
    public static Integer [] removeLocalMaxima(Integer [] array) {
        Integer [] withoutMaxima = array;
        boolean hasMaxima = false;
        int counter = 0;

        for (int i = 0; i < array.length-1; i++) {
            if (i == 0) {
                if (array[0] > array[1]) {
                    withoutMaxima[0] = null;
                    counter++;
                }
            }
            if (i > 0) {
                if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                    withoutMaxima[i] = null;
                    counter++;
                }
            }
            if (i == array.length-1) {
                if(array[i] > array[i-1]) {
                    array[i] = null;
                    counter++;
                }
            }
        }

        if (!hasMaxima) {
            withoutMaxima = array;
        }

        Integer[] finalArr = new Integer[counter];
        for (Integer integer : withoutMaxima) {
            if (integer != null) {
                Arrays.fill(finalArr, integer);
            }
        }

        return finalArr;
    }

    public static void main(String[] args) {
        Integer [] arr = removeLocalMaxima(new Integer []{18, 1, 3, 6, 7, -5});
        System.out.println(Arrays.toString(arr));
    }
}

