package com.kostyanetskaya.epamjavastudy.lesson7.tasks.figures;
import com.kostyanetskaya.epamjavastudy.lesson5.tasks.Point;

class Circle extends Figure{
    private Point center;
    private double radius;

    Circle (Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }
    @Override
    public double area() {
        return getRadius()*getRadius() * Math.PI;
    }

    @Override
    public String pointsToString() {
        return "(" +
                center.getX() + "," +
                center.getY() + ")";
    }

    @Override
    public Point leftmostPoint() {
        return new Point((center.getX() - radius), center.getY());
    }

    @Override
    public String toString() {
        return "Circle[" + "(" +
                center.getX() + "," +
                center.getY() +
                ")" + radius +
                "]";
    }
}
