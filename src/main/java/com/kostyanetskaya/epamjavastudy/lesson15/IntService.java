package com.kostyanetskaya.epamjavastudy.lesson15;

import java.util.Optional;

public class IntService {
    public IntService() {
    }
    public double average (int[] ints) {
        double sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum+= ints[i];
        }
        return sum / ints.length;
    }

    public Optional<Double> averageOpt (int[] ints) {
        Optional<Double> result;
        if (ints == null || ints.length ==0) {
            result = Optional.empty();
        }
        else {
            double avg = average(ints);
            result = Optional.of(avg);
        }
        return result;
    }
}
