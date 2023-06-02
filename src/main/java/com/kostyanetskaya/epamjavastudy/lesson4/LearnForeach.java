package com.kostyanetskaya.epamjavastudy.lesson4;

import java.util.Arrays;

public class LearnForeach {
    public static void main(String[] args) {
        String [] strings = {"Java", "Oracle", "<epam>"};

        for (String element: strings) {
            element += 11;
        }

        System.out.println(Arrays.toString(strings));

        StringBuilder[] stringBuilders = new StringBuilder[3];
        stringBuilders[0] = new StringBuilder("Java");
        stringBuilders[1] = new StringBuilder("Oracle");
        stringBuilders[2] = new StringBuilder("<epam>");
        for (StringBuilder element: stringBuilders
             ) {
            element.append(11);
        }

        System.out.println(Arrays.toString(stringBuilders));

        String[] strArray = new String[] {"One", "Two", "Three"};
        strArray[2] = null;
        for (String val : strArray)
            System.out.print(val + ", ");
    }
}

class Task {
    public static void main(String[] args) {
        int[] array = {2, -3, 55, 0, 9, -100};
        int max = array[0];

        for (int number: array) {
            if (number > max) {
                max = number;
            }
        }

        System.out.println(max);

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = max;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
