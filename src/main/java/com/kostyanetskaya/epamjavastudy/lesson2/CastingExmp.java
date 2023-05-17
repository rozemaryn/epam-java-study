package com.kostyanetskaya.epamjavastudy.lesson2;

public class CastingExmp {
    public static void main(String[] args) {
        int i = 3;
        int i1 = -i;
        byte b = 1;
        byte b1 = 1 + 2;                // line 1
//        short s = 30411111;               // line 2
        short s1 = (short) 304111;       // line 3
//       b = b1 + 1;                     // line 4
        b = (byte)  (b1 + 1);           // line 5
//       b = −b;                         // line 6
//       b = (byte) −b;                  // line 7
       b1 *= 2;                       // line 8
//       b = i;                          // line 9
        b = (byte)  i;
        b += i++;
        float f = 1.1f;
        b /= f;

        System.out.println(b);
    }
}

class Example2 {
    public static void main(String[] args) {
        float f = 1 / 2;
        int i = 1 / 3;
//        float f2 = 1.45;
        double d = 555d;
    }
}

class TestCompile {
    public static void main(String[] argv){
        long x = 5;
        long y = 2;
//        byte b = (byte) x / y;
    }
}


