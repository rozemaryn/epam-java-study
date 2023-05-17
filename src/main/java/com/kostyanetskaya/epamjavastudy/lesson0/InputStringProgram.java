package com.kostyanetskaya.epamjavastudy.lesson0;

import java.util.Scanner;

public class InputStringProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("Hello, " + input);
    }
}
