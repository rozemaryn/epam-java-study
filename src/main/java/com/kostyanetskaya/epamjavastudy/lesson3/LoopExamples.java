package com.kostyanetskaya.epamjavastudy.lesson3;

public class LoopExamples {
    public static void main(String[] arg) {
        int i = 0;
        while (true) {
            if (i > 6) {
                break;
            }
            System.out.println(i++);
        }
    }
}

class SecondExample {
    public static void main(String[] args) {
        int value = 42;
        while (value < 50) {
            value++;
            if (value > 44 && value < 48) {
                continue;
            }
            System.out.println(value);
        }
    }
}

class ThirdExample {
    public static void main(String[] args) {
        int i = 0;
        outer: while (i++ < 3) {
            int j = 0;
            while (j++ < 5) {
                if (j == 2) {
                    continue outer;
                }
                System.out.println("i = " + i + "; j = " + j);
            }
        }

    }
}

class FourthExample {
    public static void main(String[] args) {
        int a,b;
        for (a = 1, b = 4; a < b; a++, b--) {
            System.out.println("\nНачало итерации");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("Завершение итерации");
        }
        System.out.println("какой-то текст");
    }
}
