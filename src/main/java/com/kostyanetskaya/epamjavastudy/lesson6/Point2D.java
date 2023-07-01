package com.kostyanetskaya.epamjavastudy.lesson6;

public class Point2D extends Point1D {
    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public double length() {
        return Math.hypot(y, getX());
    }

    public void method(double value) {
        System.out.println("double" + value);
    }


}

class PointMain {
    public static void main(String[] args) {
        Point1D point1 = new Point1D();
        point1.setX(3);
        System.out.println(point1.length());

        Point1D point2 = new Point2D();
        point2.setX(3);
        ((Point2D)point2).setY(4);
        System.out.println(point2.length());



    }
}

class ParentClass {
    void parentMethod(int i) {
        System.out.println("parentMethod ParentClass" + i);
    }
}
class A2 {
    String version = "1.0 A";
    String testMethod() {
        return "A";
    }
}
class B2 extends A2 {
    String version = "1.0 B";
    String testMethod() {
        return "B";
    }
}
class Main4 {
    public static void main(String[] args) {
        A2 a = new B2();
        System.out.println(a.version + a.testMethod());
    }
}
