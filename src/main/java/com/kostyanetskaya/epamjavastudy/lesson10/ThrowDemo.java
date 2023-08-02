package com.kostyanetskaya.epamjavastudy.lesson10;

import java.io.IOException;

public class ThrowDemo {
    static void testG() {
        try {
            throw new ClassCastException("Demo");
        } catch (ClassCastException  exp) {
            System.out.println("Exception in method!");
            throw exp;
        }
    }
    public static void main(String[] args) {
        try {
            testG();
        } catch (ClassCastException e) {
            System.out.println("Exception of method!");
        }
    }
}

class Exmp2 {
    public static void main(String[] args) {
        try {
            testExcp();
        } catch(Exception exp) {
            System.out.println(exp.getMessage());
        }
    }
    public static void testExcp() throws Exception {
        throw new Exception("test");
    }
}

class Exmp3 {
    public void doJob() throws RuntimeException {
        try {
            doJob2();
        } finally {
            System.out.println("finally block");
        }
    }
    public void doJob2() {
        throw new RuntimeException();
    }
}

class Exmp4 {
    public void doJob() throws Exception {
        try {
            doJob2();
        } catch (Exception e) {
            throw new Exception(e.getMessage() + "more info");
        } finally {  /* ... */  }
    }
    public void doJob2() throws Exception {
        throw new Exception();
    }
}

class OverAndOver {
    static  String s = "";
    public static void main(String[] args) {
        try  {
            s += "1";
            throw new Exception();
        }  catch (Exception e) {
            s += "2";
        }  finally {
            s += "3";
            doStuff();
            s += "4";
        }
        System.out.println(s);
    }
    static void doStuff() {
        int x = 0;
        int y = 7 / x;
    }
}

class Quest {
    private static void ioRead() throws IOException{}
    public static void main(String[] args) {
        try {
            ioRead();
        } catch (IOException e){}
    }
}
class Person { }
class Father extends Person {
    public void dance() throws ClassCastException { }
}
 class Home {
    public static void main(String[] args) {
        Person p = new Person();
        try  {
            ( (Father)p).dance();
        }
        finally
        { }
    }
}