package com.kostyanetskaya.epamjavastudy.lesson8;

public class ArrayOperation {
    public static class Pair {
        private double min;
        private double max;
        public Pair(double f, double s) {
            min = f;
            max = s;
        }
        public double getMin() {
            return min;
        }
        public double getMax() {
            return max;
        }
    }
    public static Pair searchMinMax(double[] values) {
        double min = values[0];
        double max = values[0];
        for (double v: values) {
            if (min > v) {
                min = v;
            }
            if (max < v) {
                max = v;
            }
        }
        return new Pair(min, max);
    }
}
class DemoNestedMain {
    public static void main(String[] args) {
        double[] array = new double[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = 100 * Math.random();
        }
        ArrayOperation.Pair pair = ArrayOperation.searchMinMax(array);
        System.out.println("min = " + pair.getMin());
        System.out.println("max = " + pair.getMax());
    }
}