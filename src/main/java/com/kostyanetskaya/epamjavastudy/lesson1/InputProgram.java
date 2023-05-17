package com.kostyanetskaya.epamjavastudy.lesson1;

import java.io.IOException;

public class InputProgram {
    public static void main(String[] args) throws IOException {
        int x = System.in.read();
        System.out.println("code " + x + " x = " + (char)x);
    }
}
