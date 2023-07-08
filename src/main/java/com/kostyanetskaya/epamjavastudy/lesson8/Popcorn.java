package com.kostyanetskaya.epamjavastudy.lesson8;

public class Popcorn {
    public void pop() {
        System.out.println("popcorn");
    }
}
class Food {
    Popcorn p = new Popcorn() {
        public void sizzle() {
            System.out.println("anonymous sizzling popcorn");
        }
        public void pop() {
            System.out.println("anonymous popcorn");
        }
    };
    public static void main(String[] args) {
        Food food = new Food();
        food.p.pop();
        // food.p.sizzle();
    }
}

interface Cookable {
    public void cook();
}
class Food2 {
    Cookable c = new Cookable() {
        public void cook() {
            System.out.println("anonymous cookable implementer");
        }
    };
    public static void main(String[] args) {
        Food2 food = new Food2();
        food.c.cook();
    }
}
