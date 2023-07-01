package com.kostyanetskaya.epamjavastudy.lesson6;

public class Student extends AnotherPerson {
    private int yearOfStudy;

    public Student(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public Student(int id, String name, int yearOfStudy) {
        super(id, name);
        this.yearOfStudy = yearOfStudy;
    }

    public Student(int id, int yearOfStudy) {
        this(yearOfStudy);
    }
}

class A {
    public void job() {
        System.out.println("Class A");
    }
}
class B extends  A  {
    public void job(int i) {
        System.out.println("Class B");
    }
    public static void main(String [] args) {
        B b = new B();
        b.job();
    }
}
