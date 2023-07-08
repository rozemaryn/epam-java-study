package com.kostyanetskaya.epamjavastudy.lesson7;

public class Test {
}

abstract class Animal {
    public abstract void move();
}

abstract class Reptiles extends Animal {   }

class Boa extends Reptiles {
    @Override
    public void move() {
        System.out.println("Boa move");
    }
}

class Main {
    public static void main(String[] arg) {
        Animal animal = new Boa();
        animal.move();
    }
}

