package com.kostyanetskaya.epamjavastudy.lesson15.tasks;

import java.util.OptionalInt;

public class MaxMethod {
    public static OptionalInt max(int[] values) {
        OptionalInt result;

        if (values == null || values.length == 0) {
            result = OptionalInt.empty();
            return result;
        }

        int max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > max)
                max = values[i];
        }

        result = OptionalInt.of(max);

        return result;
    }
    public static void main(String[] args) {
        int[] vals = new int[]{-2, 15, 10, 5};
        OptionalInt result = MaxMethod.max(vals);
        System.out.println(result.getAsInt() == 15);
    }
}
