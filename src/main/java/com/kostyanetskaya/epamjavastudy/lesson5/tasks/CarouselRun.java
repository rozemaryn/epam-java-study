package com.kostyanetskaya.epamjavastudy.lesson5.tasks;

public class CarouselRun {
     int[] decArray;
        static int decCounter = 0;

        public int next() {
            if (isFinished()) {
                return -1;
            }
            while (!isAllNull()) {
                if (decCounter == decArray.length) {
                    decCounter = 0;
                }

                if (decArray[decCounter] > 0) {
                    int original = decArray[decCounter];

                    decArray[decCounter]--;
                    decCounter++;

                    return original;
                }

                if (decArray[decCounter] == 0) {
                    decCounter++;
                }
            }
            return -1;
        }

        public boolean isAllNull() {
            for (int j : decArray) {
                if (j != 0)
                    return false;
            }
            return true;
        }

        public boolean isFinished() {
            if (decArray.length == 0 || isAllNull())
            {return true;}

            return false;
        }

    }
