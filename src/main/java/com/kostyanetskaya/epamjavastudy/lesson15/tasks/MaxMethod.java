package com.kostyanetskaya.epamjavastudy.lesson15.tasks;

import java.util.OptionalInt;

public class MaxMethod {
    public static OptionalInt max(int[] values) {
        if (values == null || values.length == 0) {
            return OptionalInt.empty();
        }

        int max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > max)
                max = values[i];
        }
        return OptionalInt.of(max);
    }
    public static void main(String[] args) {
        int[] vals = new int[]{-2, 15, 10, 5};
        OptionalInt result = MaxMethod.max(vals);
        System.out.println(result.getAsInt() == 15);
    }
}
