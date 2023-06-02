package com.kostyanetskaya.epamjavastudy.lesson4;

import java.util.Arrays;

public class LearnArrayCopy {
    public static void main(String[] args) {
        int [] array = {21, 22, 23, 24};
        int [] destination = {49, 48, 47, 46, 45, 44, 43, 42};

        System.arraycopy(array, 0, destination, 0, array.length);
        System.out.println(Arrays.toString(destination));
    }
}
