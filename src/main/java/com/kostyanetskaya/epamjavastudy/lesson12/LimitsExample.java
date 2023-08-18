package com.kostyanetskaya.epamjavastudy.lesson12;

import java.util.Arrays;
import java.util.List;

public class LimitsExample {
}

class Div  <T extends Number> {
private T x;
private T y;
        Div(T a, T b) {
        x = a;
        y = b;
        }
public int perform() {
        return (int)(x.doubleValue() / y.doubleValue());
        }
        }

class DivTest {
    public static void main(String [] args) {
        double  aD = Math.random() * 100;
        double  bD = Math.random() * 100;
        short   aS = (short)(Math.random() * 100);
        short   bS = (short)(Math.random() * 100);
        Div<Double>  divD  = new Div <>(aD, bD);
        System.out.println(aD + " : " + bD + " = " + divD.perform());
        Div<Short>  divS  = new Div <>(aS, bS);
        System.out.println(aS + " : " + bS + " = " + divS.perform());
        // ошибка компиляции
        //Div<Character>  obj3 = new Div<>('9', '2');
    }
}

class HelloWorld {

    public static class Util {
        public static <T> T getValue(Object obj, Class<T> clazz) {
            return (T) obj;
        }

        public static <T> T getValue(Object obj) {
            return (T) obj;
        }
    }

    public static void main(String[] args) {
        List list = Arrays.asList("Author", "Book");
        for (Object element : list) {
            String data = Util.getValue(element, String.class);
            System.out.println(data);
            System.out.println(Util.<String>getValue(element));
        }
    }
}

