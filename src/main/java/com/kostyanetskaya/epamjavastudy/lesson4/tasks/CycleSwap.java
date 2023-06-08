package com.kostyanetskaya.epamjavastudy.lesson4.tasks;

import java.util.Arrays;

public class CycleSwap {
    static void cycleSwap(int[] array) {
       int [] buf = new int[array.length];
       System.arraycopy(array,0, buf, 1, array.length-1);
       buf[0] = array[array.length-1];
       System.arraycopy(buf, 0, array, 0, array.length);
    }

    static void cycleSwap(int[] array, int shift) {
        int [] buf = new int[array.length];
        if (shift == array.length) {
            buf = array;
        }
        else {
        System.arraycopy(array, shift+1, buf, 0, shift);
        System.arraycopy(array,0, buf, shift, array.length-shift);
        System.arraycopy(buf, 0, array, 0, array.length);}
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 7, 4};
//        CycleSwap.cycleSwap(array);
//        System.out.println(Arrays.toString(array));
        CycleSwap.cycleSwap(array, 5);
        System.out.println(Arrays.toString(array));
    }
}
