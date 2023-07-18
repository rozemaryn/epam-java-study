package com.kostyanetskaya.epamjavastudy.lesson7.tasks.figures;

import com.kostyanetskaya.epamjavastudy.lesson5.tasks.Point;
import com.kostyanetskaya.epamjavastudy.lesson5.tasks.Segment;

import java.util.ArrayList;

class Quadrilateral extends Figure {
    private Point A;
    private Point B;
    private Point C;
    private Point D;

    private final double a;
    private final double b;
    private final double c;
    private final double d;


    public Quadrilateral(Point A, Point B, Point C, Point D) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;

        a = new Segment(A, B).length();
        b = new Segment(B, C).length();
        c = new Segment(C, D).length();
        d = new Segment(D, A).length();
    }

    @Override
    public double area() {
        double d1 = new Segment(A, C).length();
        double d2 = new Segment(B, D).length();

        double sinAngle = ((C.getY() - A.getY()) * (D.getX() - B.getX()) - (D.getY() - B.getY()) * (C.getX() - A.getX())) / (d1 * d2);

        return 0.5 * sinAngle * d1 * d2;
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
                C.getY() + ")" +
                "(" +
                D.getX() + "," +
                D.getY() + ")"
                ;

    }

    @Override
    public Point leftmostPoint() {
        Point left = A;

        ArrayList <Point> points = new ArrayList<>();
        points.add(A);
        points.add(B);
        points.add(C);
        points.add(D);

        for (Point p: points) {
            if (p.getX() < left.getX()) {
                left = p;
            }
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

    public Point getD() {
        return D;
    }
}
