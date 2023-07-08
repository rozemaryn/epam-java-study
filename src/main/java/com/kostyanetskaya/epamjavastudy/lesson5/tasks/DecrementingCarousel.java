package com.kostyanetskaya.epamjavastudy.lesson5.tasks;

public class DecrementingCarousel {
        public static boolean runCalled = false;
        public int[] array;
        int counter = 0;


        public DecrementingCarousel(int capacity) {
            array = new int[capacity];
        }

        public boolean addElement(int element) {
            if (element <= 0 || array[array.length-1] != 0 || runCalled) {
                return false;
            }
            array[counter] = (element);
            counter++;
            return true;
        }

        public CarouselRun run(){
            if (runCalled){
                return null;
            }
            CarouselRun carouselRun = new CarouselRun();
            carouselRun.decArray = array;
            runCalled = true;
            return carouselRun;
        }

        public static void main(String[] args) {
            DecrementingCarousel carousel = new DecrementingCarousel(10);
            System.out.println(carousel.run() == null); //false
            System.out.println(carousel.run() == null); //true
        }
    }

