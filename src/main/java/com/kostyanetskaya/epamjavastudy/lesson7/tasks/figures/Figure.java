package com.kostyanetskaya.epamjavastudy.lesson7.tasks.figures;
import com.kostyanetskaya.epamjavastudy.lesson5.tasks.Point;

abstract class Figure{

    public abstract double area();

    public abstract String pointsToString();

    public String toString() {
        return this.getClass().getSimpleName() + "[" + pointsToString() + "]";
    }

    public abstract Point leftmostPoint();
}