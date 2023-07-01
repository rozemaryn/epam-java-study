package com.kostyanetskaya.epamjavastudy.lesson6;

public class Car {
    private int numOfCars;
    //другие поля
    public Car() {
        numOfCars++;
    }
    //другие методы
    public int getNumOfCars() {
        return numOfCars;
    }
}
class Demo2 {
    public static void main(String[] arg) {
        Car сar1 = new Car();
        Car сar2 = new Car();
        Car сar3 = new Car();
        System.out.println(сar3.getNumOfCars());
    }
}

class CustomMath {
    public static int percent;
    public static int add(int x, int y) {
        return x + y + percent;
    }
    public static int multiply(int x, int y) {
        return x * y;
    }
}