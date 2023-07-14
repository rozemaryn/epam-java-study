package com.kostyanetskaya.epamjavastudy.lesson7.tasks.figures;

import static java.lang.Math.sqrt;
import com.kostyanetskaya.epamjavastudy.lesson5.tasks.Point;
import com.kostyanetskaya.epamjavastudy.lesson5.tasks.Segment;


class Triangle extends Figure {
    private Point A;
    private Point B;
    private Point C;
    private double a;
    private double b;
    private double c;


    public Triangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;

        a = new Segment(B, C).length();
        b = new Segment(A, C).length();
        c = new Segment(A, B).length();
    }

    @Override
    public double area() {
        double p = (a + b + c)/2;
        return sqrt(p * (p - a)*(p - b)*(p - c));
    }

    @Override
    public String pointsToString() {
        return "(" +
                A.getX() + "," +
                A.getY() + ")" +
                "(" +
                B.getX() + "," +
                B.getY() + ")" +
                "(" +
                C.getX() + "," +
                C.getY() + ")";
    }

    @Override
    public Point leftmostPoint() {
        Point left = A;
        if (A.getX() > B.getX()) {
            left = B;
            if (B.getX() > C.getX()) {
                left = C;
            }
        }
        else if (A.getX() > C.getX()) {
            left = C;
        }
        return left;
    }

    public Point getA() {
        return A;
    }

    public Point getB() {
        return B;
    }

    public Point getC() {
        return C;
    }


}
