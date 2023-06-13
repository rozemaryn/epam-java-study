package com.kostyanetskaya.epamjavastudy.lesson4.tasks;

import java.util.Arrays;

public class CycleSwap {
    static void cycleSwap(int[] array) {
        if (array.length == 0) {
            return;
        }
        int[] buf = new int[array.length];
        System.arraycopy(array, 0, buf, 1, array.length - 1);
        buf[0] = array[array.length - 1];
        System.arraycopy(buf, 0, array, 0, array.length);
    }

    static void cycleSwap(int[] array, int shift) {
        int[] buf = new int[array.length];
        if (shift == array.length) {
            buf = array;
        }
        if (array.length == 0) {
            return;
        } else {
            System.arraycopy(array, array.length - shift, buf, 0, shift);
            System.arraycopy(array, 0, buf, shift, array.length - shift);
            System.arraycopy(buf, 0, array, 0, array.length);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
//        CycleSwap.cycleSwap(array);
//        System.out.println(Arrays.toString(array));
        CycleSwap.cycleSwap(array, 3);
        System.out.println(Arrays.toString(array));
    }
}

class SecondSolution {
    static void cycleSwap(int[] array) {
        int buf;
        int buf2;

        for (int i = 0; i < array.length - 1; i++) {
            buf = array[0];
            buf2 = array[i + 1];

            array[i + 1] = buf;
            array[0] = buf2;
        }
    }

    static void cycleSwap(int[] array, int shift) {
        int buf;
        int buf2;
        int buf3;

        for (int i = 0; i < array.length - shift; i++) {
            buf = array[i];
            buf2 = array[i + shift];

            array[i] = buf2;
            array[i + shift] = buf;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 7, 4};
        cycleSwap(array, 3);
        System.out.println(Arrays.toString(array));
    }
}
