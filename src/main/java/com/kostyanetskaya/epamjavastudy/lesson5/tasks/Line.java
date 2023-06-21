package com.kostyanetskaya.epamjavastudy.lesson5.tasks;

/*
Написать метод, который будет вовзращать точку пересечения двух прямых в виде объекта Point
 */
public class Line {
    private int k;
    private int b;

    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line line2) {
        Line line1 = this;
        if (line1.k == line2.k
        ) {
            return null;
        }
        int x = (line2.b - line1.b) / (line1.k - line2.k);
        int y = line1.k*x + line1.b;

        return new Point(x, y);
    }

    public static void main(String[] args) {
        Line line1 = new Line(2,56);
        Line line2 = new Line(4,-4);

        System.out.println("result is " + line1.intersection(line2));
    }
}

