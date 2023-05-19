package com.kostyanetskaya.epamjavastudy.lesson3.tasks;

import java.io.IOException;
import java.util.Scanner;

/* Write a program, asks for a number - amount of strangers to meet.
Then reads stranger names line by line and prints line by line "Hello, ...".*/

public class MeetStrangers {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int number = sc.nextInt();
        String name;

        if (number > 0) {
            for (int i = 0; i < number; i++) {
                name = sc2.nextLine();
                System.out.println("Hello, " + name);
            }
        } else if (number == 0) {
            System.out.println("Oh, it looks like there is no one here");
        } else {
            System.out.println("Seriously? Why so negative?");
        }
    }
}



