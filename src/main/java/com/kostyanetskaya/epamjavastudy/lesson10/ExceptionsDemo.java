package com.kostyanetskaya.epamjavastudy.lesson10;

public class ExceptionsDemo {
    static void procA() {
        try {
            System.out.println("Method procA()");
            return;
        } finally {
            System.out.println("Block finally of method procA()");
        }
    }

    static int procB() {
        try {
            System.out.println("Method procB()");
            return 1;
        } finally {
            System.out.println("Block finally of method procB()");
            return 0;
        }
    }

    public static void main(String[] args) {
        procA();
        System.out.println(procB());
    }
}

class LearnFinally {
    public static void main(String[] args) {
        String[] numbers = {"42", "0", "Y-", "33"};
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            try {
                sum += 100 / Integer.parseInt(numbers[i]);
            } catch (ArithmeticException e) {
                System.err.println(e);
            } finally {
                System.out.println("Counter = " + ++counter);
            }
        }
        System.out.println(sum);
    }
}

class Test {
    public static void main(String[] args) {
        try {
            method();
        } catch (StackOverflowError e) {
            for (int i = 0; i < 2; ++i)
                System.out.println(i);
        }
    }

    public static void method() {
        method();
    }
}


