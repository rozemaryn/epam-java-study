package com.kostyanetskaya.epamjavastudy.lesson3.tasks;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        /*
        For the given quadratic equation coefficients (ax2 + bx + c = 0),
        return one or two roots of the equation if there is any in the set of real numbers.

        Input value is given via System.in. Output value must be printed to System.out.
        Output format is:
        — "x1 x2" (two roots in any order separated by space) if there are two roots,
        — "x" (just the value of the root) if there is the only root,
        — "no roots" (just a string value "no roots") if there is no root.

        The a parameter is guaranteed to be not zero.
         */

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double x1;
        double x2;

        double D = b*b - 4*a*c;

        if (D > 0) {
            x1 = (-b + Math.sqrt(D)) / (2*a);
            x2 = (-b - Math.sqrt(D)) / (2*a);
            System.out.println(x1 + " " + x2);
        }
        else if (D==0) {
            x1 = (-b + D)/2*a;
            System.out.println(x1);
        }
        else {
            System.out.println("No roots");
        }
    }
}
