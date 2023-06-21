package com.kostyanetskaya.epamjavastudy.lesson5.tasks;

import static java.lang.Math.*;

public class Segment {
    private Point beginning;
    private Point end;

    public Segment (Point point1, Point point2) {
        this.beginning = point1;
        this.end = point2;
    }

    public double length () {
        double length = sqrt(pow((this.end.x - this.beginning.x), 2) + pow((this.end.y - this.beginning.y), 2));
        return length;
    }

    public static void main(String[] args) {
        double length = new Segment(new Point(0, 0), new Point(3, 4)).length();
        System.out.println(length);
    }
}
