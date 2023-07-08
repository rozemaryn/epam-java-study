package com.kostyanetskaya.epamjavastudy.lesson7.tasks;

public class TaskCarousel implements Task{
    private int[] array;
    private int counterArray;
    private int counterExecute;

    public TaskCarousel(int length) {
        this.array = new int[length];
    }

    public boolean isEmpty () {
        for (int i: array) {
            if (i != 0)
                return false;
        }
        return true;
    }

    public boolean isFull () {
        return array[array.length - 1] != 0;
    }

//    public boolean addTask () {
//        return true;
//        if (isFull()) {
//            return false;
//        }
//    }

    @Override
    public boolean execute() {
        if (counterArray == 0) {
            return false;
        }
        return true;

    }

    public static void main(String[] args) {
        TaskCarousel carousel = new TaskCarousel(4);

        System.out.println(carousel.isEmpty()); //true
        System.out.println(carousel.isFull()); //false
        System.out.println(carousel.execute()); //false

        CountDownTask task = new CountDownTask(2);
//        System.out.println(carousel.addTask(task)); //true

//        System.out.println(carousel.isEmpty()); //false
//        System.out.println(carousel.isFull()); // false
//
//        System.out.println(task.getValue()); //2
//        System.out.println(carousel.execute()); //true
//        System.out.println(task.getValue()); //1
//        System.out.println(carousel.execute()); //true
//        System.out.println(task.getValue()); //0

        System.out.println(carousel.execute()); //false
        System.out.println(carousel.isEmpty()); //true
    }
}

class Outer {
    private String x = "Outer";
    void doStuff() {
        class Inner {

            public void seeOuter() {
                System.out.println("Outer x is " + x);
            }
        }
        Inner mi = new Inner();
        mi.seeOuter();
    }
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.doStuff();
    }
}
