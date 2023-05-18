package com.kostyanetskaya.epamjavastudy.lesson3;

public class ExamplesFromLesson {
    public static void main(String[] args) {
        int counter = 1;
        {
            int valuelnt = 2 + counter++;
            System.out.println("counter = " + counter + "; valuelnt = " + valuelnt);
        }
    }
}

class Exmp2 {
    public static void main(String[] args) {
        {
            int x = 10;
            int y = -10;
            System.out.println("(" + x + "; " + y + ")");
        }
        {
            double x = 0.1;
            double y = -0.1;
            System.out.println("(" + x + "; " + y + ")");
        }
    }
}
