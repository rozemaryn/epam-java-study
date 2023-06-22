package com.kostyanetskaya.epamjavastudy.lesson5.tasks;

import static java.lang.Math.*;

public class Triangle {
    private Point A;
    private Point B;
    private Point C;
    private final double a;
    private final double b;
    private final double c;


    public Triangle(Point A, Point B, Point C) {

        a = new Segment(B, C).length();
        b = new Segment(A, C).length();
        c = new Segment(A, B).length();

        if (a < b + c && b < c + a && c < a + b) {
            this.A = A;
            this.B = B;
            this.C = C;
        } else throw new IllegalArgumentException("Triangle is degenerate");
    }

    public double area () {
        double area = 0;
        double p = (double) (a + b + c)/2;
        area = sqrt(p * (p - a)*(p - b)*(p - c));

        return area;
    }

    public Point centroid () {
        int x = (this.A.x + this.B.x + this.C.x) / 3;
        int y = (this.A.y + this.B.y + this.C.y) / 3;

        return new Point(x, y);
    }

    public Point getA() {
        return A;
    }

    public void setA(Point a) {
        A = a;
    }

    public Point getB() {
        return B;
    }

    public void setB(Point b) {
        B = b;
    }

    public Point getC() {
        return C;
    }

    public void setC(Point c) {
        C = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "A=" + A +
                ", B=" + B +
                ", C=" + C +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(new Point(0, 0), new Point(1, 1), new Point(2, 0));
        System.out.println(triangle);

        double area = new Triangle(new Point(0,0), new Point(3, 0), new Point(0, 4)).area();
        System.out.println(area);

        Point centroid = new Triangle(new Point(0,0), new Point(3, 0), new Point(0, 3)).centroid();

        System.out.println(centroid.getX());
        System.out.println(centroid.getY());
    }
}
