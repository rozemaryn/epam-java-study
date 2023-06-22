package com.kostyanetskaya.epamjavastudy.lesson5.tasks;

import static java.lang.Math.*;

public class Segment {
    private final Point beginning;
    private final Point end;

    public Segment (Point point1, Point point2) {
        if (point1.equals(point2)) {
            throw new IllegalArgumentException("The segment is degenerate");
        }
        this.beginning = point1;
        this.end = point2;
    }

    public double length () {
        double length = sqrt(pow((this.end.x - this.beginning.x), 2) + pow((this.end.y - this.beginning.y), 2));
        return length;
    }

    public Point midpoint() {
        Point midpoint = new Point((this.beginning.getX() + this.end.getX()) / 2,(this.beginning.getY()+ this.end.getY()) / 2);
        return midpoint;
    }

    public Point intersection(Segment another) {
        int x1 = this.beginning.x;
        int y1 = this.beginning.y;
        int x2 = this.end.x;
        int y2 = this.end.y;

        int x3 = another.beginning.x;
        int y3 = another.beginning.y;
        int x4 = another.end.x;
        int y4 = another.end.y;

        int divider = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);

        double t = (double) ((x1 - x3)*(y3 - y4) - (y1 - y3)*(x3 - x4)) / divider;
        double u = (double) ((x1 - x3)*(y1 - y2) - (y1 - y3)*(x1 - x2)) / divider;

        if (t >= 0 && t <= 1 && u >= 0 && u <= 1) {
            return new Point((int) (x1 + t*(x2 - x1)), (int) (y1 + t*(y2 - y1)));
        }
        else {return null;}
    }
    public static void main(String[] args) {
        //падаем по ошибке, вырожденный отрезок
        // Segment notSegment = new Segment(new Point(1,1), new Point(1,1));

        double length = new Segment(new Point(0, 0), new Point(3, 4)).length();
        System.out.println(length);

        Segment segment = new Segment(new Point(2, 0), new Point(0, 2));
        Point midpoint = segment.midpoint();

        System.out.println(midpoint.getX());
        System.out.println(midpoint.getY());

        Segment first = new Segment(new Point(0, 0), new Point(4, 4));
        Segment second = new Segment(new Point(2, 0), new Point(0, 2));
        Point intersection = first.intersection(second);

        System.out.println(intersection.getX());
        System.out.println(intersection.getY());

//        Segment first = new Segment(new Point(0, 0), new Point(4, 0));
//        Segment second = new Segment(new Point(2, 1), new Point(1, 2));
//        Point intersection = first.intersection(second);
//
//        System.out.println(intersection == null);


    }
}
