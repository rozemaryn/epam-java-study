package com.kostyanetskaya.epamjavastudy.lesson3.tasks;

import java.util.Scanner;

public class Snail {
    //Write a program that reads a,b and h (line by lyne in this order) and prints
    //the number of days for which the snail reach the top of the tree.
    //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ascend = sc.nextInt();
        int descend = sc.nextInt();
        int treeHeight = sc.nextInt();

        int days = 1;
        int ascensionByDay = 0;

        if (ascend <= descend && ascend < treeHeight) {
            System.out.println("Impossible");
        } else {
            while (ascensionByDay < treeHeight) {
                ascensionByDay += ascend;
                if (ascensionByDay >= treeHeight) {
                    System.out.println(days);
                    break;
                } else {
                    days++;
                    ascensionByDay -= descend;
                }
            }
        }
    }
}

