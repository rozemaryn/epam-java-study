package com.kostyanetskaya.epamjavastudy.lesson6;

public class Point1D {
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double length () {
        return Math.abs(x);
    }

    public void method(){
        System.out.println("without");
    }
    public void method (int value) {
        System.out.println("int" + value);
    }
    public static void method (String str){
        System.out.println("String" + str);
    }
}
