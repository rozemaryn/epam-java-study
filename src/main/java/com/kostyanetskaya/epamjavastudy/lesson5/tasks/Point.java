package com.kostyanetskaya.epamjavastudy.lesson5.tasks;

import java.util.Objects;

public class Point {
    final double x;
    final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("(%d;%d)", x, y);
    }




}
