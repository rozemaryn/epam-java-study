package com.kostyanetskaya.epamjavastudy.lesson3;

public class LearnMainIf {
    public static double perimeter(double lengthA, double lengthB, String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name shouldn't be null");
        }
        double result;
        if (lengthA > 0 && lengthB > 0) {
            result = 2 * (lengthA + lengthB);
        } else {
            result = -1;
        }
        return result;
    }

    public static void main(String[] args) {
        perimeter(1,4,null);
    }
}
