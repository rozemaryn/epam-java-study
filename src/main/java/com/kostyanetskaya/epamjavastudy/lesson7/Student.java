package com.kostyanetskaya.epamjavastudy.lesson7;

import java.util.Date;

public class Student implements Cloneable {
    private Date yearSet;
    private int group;
    public Student(Date year, int group) {
        this.yearSet = year;
        this.group = group;
    }
    public String toString() {
        return "year = " + yearSet + ", group = " + group;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
class StudentTest {
    public static void main(String[] arg) throws Exception  {
        Date dd = new Date( System.currentTimeMillis() );
        Student stud1 = new Student(dd, 201);
        System.out.println(stud1);
        Student stud2 = (Student) stud1.clone();
        System.out.println(stud2);
    }
}