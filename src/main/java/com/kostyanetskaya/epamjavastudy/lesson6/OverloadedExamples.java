package com.kostyanetskaya.epamjavastudy.lesson6;

public class OverloadedExamples {
}

//class Main {
//    static void doJob(String... ss) {
//        System.out.println("String...");
//    }
//    static void doJob(String s1, String s2) {
//        System.out.println("String, String");
//    }
//    static void doJob(String s1, String... str) {
//        System.out.println("String, String...");
//    }
//    public static void main(String[] args) {
//        doJob("hi");
//        doJob("hi", "hi", "hi");
//    }
//}

class Exmp2 {
    static void doJob(Object obj1, Object obj2) {
        System.out.println("Object, Object ");
    }
    static void doJob(String str, Object... oo) {
        System.out.println("String, Object...");
    }
    public static void main(String[] args) {
        doJob("hi", "hi");
        doJob(new Object(), "hi");
        doJob("hi", "hi", "hi");
    }
}

class Exmp3 {
    public static void main(String[] args) {
        Point2D point = new Point2D();
        point.method();
        point.method(14.4);
        point.method(4);
        Point2D.method("Java");
    }
}



