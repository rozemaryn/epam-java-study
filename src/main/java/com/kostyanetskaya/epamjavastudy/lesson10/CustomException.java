package com.kostyanetskaya.epamjavastudy.lesson10;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CustomException {
}

class MarkException extends Exception {
    @Override
    public String getMessage() {
        return "Недопустимое значение!";
    }
}
class Student {
    private String firstName;
    private int group;
    private double mark;
    //...
    public void setMark(double mark) throws MarkException {
        if (mark < 0 || mark > 100) {
            throw new MarkException();
        }
        this.mark = mark;
    }
}
class Main {
    public static void main(String[] args) {
        Student stud = new Student();
        try {
            stud.setMark(101);
        } catch (MarkException ee) {
            System.err.println(ee.getMessage());
        }
    }
}

class Main2 {
    public static void main(String[] args) {
        try {
            System.out.println(methodA());
        }
        catch (Throwable ex) {
            System.out.println("Main Catch");
        }
    }
    static int methodA() {
        if(methodB() >0) {
            try {
                throw new UnknownError();
            }
            catch (Exception ex) {
                return 2;
            }
        }
        else {
            return 3;
        }
    }
    static int methodB()
    {
        try {
            throw new RuntimeException();
        }
        catch (Exception ex) {
            return 0;
        }
        finally {
            return 1;
        }
    }
}

class ExceptionOne extends Exception {}
class ExceptionTwo extends ExceptionOne {}
abstract class Abstract {
    abstract void method() throws ExceptionOne;
}
class Main3 extends Abstract {
    static int a,b,c,d;
    @Override
    void method() throws ExceptionTwo {
        throw new ExceptionTwo();
    }
    public static void main(String[] args) {
        Main3 main = new Main3();
        try {
            main.method();
            a++;
        }
        catch (ExceptionTwo ex) {
            b++;
        }
        catch (ExceptionOne ex) {
            c++;
        }
        finally {
            d = a + b + c;
        }
        System.out.println(a + " " + b + " " + c + " " + d);
    }
}

class A{
    public void f() throws IOException {}
}
class B extends A{
    public void f() throws FileNotFoundException, InternalError {}
}