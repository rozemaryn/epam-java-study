package com.kostyanetskaya.epamjavastudy.lesson8;

import java.util.Arrays;
import java.util.Comparator;

interface CustomTest  {
    void test();
}
public class Ship {
    private int x = 10;

    void doJob() {
        final int y = 20;
        CustomTest  tst = new CustomTest() {
            private int z = 10;
            { System.out.print("Init block"); }
            public void test() {
                System.out.print(x + " " +  z + " " + y );
            }
        };
        tst.test();
    }
}

class Test {
    public static void main(String[] args) {
        String[] arr = {"java", "scala", "fortran", "ada", "modula"};
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String str1 = (String) o1;
                String str2 = (String) o2;
                return str2.compareTo(str1);
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
