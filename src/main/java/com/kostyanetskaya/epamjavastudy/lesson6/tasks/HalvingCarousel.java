package com.kostyanetskaya.epamjavastudy.lesson6.tasks;

import com.kostyanetskaya.epamjavastudy.lesson5.tasks.CarouselRun;
import com.kostyanetskaya.epamjavastudy.lesson5.tasks.DecrementingCarousel;

public class HalvingCarousel extends DecrementingCarousel {

    public HalvingCarousel(int capacity) {
        super(capacity);
    }

    public boolean isAllNull() {
        for (int j : array) {
            if (j != 0)
                return false;
        }
        return true;
    }

    public boolean isFinished() {
        if (array.length == 0 || isAllNull()) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        DecrementingCarousel carousel = new HalvingCarousel(7);

        carousel.addElement(20);
        carousel.addElement(30);
        carousel.addElement(10);

        CarouselRun run = carousel.run();

        System.out.println(run.isFinished());
    }
}
