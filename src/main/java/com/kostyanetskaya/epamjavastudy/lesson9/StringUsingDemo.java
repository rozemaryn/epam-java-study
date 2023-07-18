package com.kostyanetskaya.epamjavastudy.lesson9;

import java.util.Arrays;
import java.util.Stack;

public class StringUsingDemo {
    static String str = "hello";
    public static void main(String[] args) {
        String str1 = new String("hello");
        System.out.println(str == str1);
        str1 = str1.intern();
        System.out.println(str == str1);

        String str2 = " ";
        System.out.println(str2.isEmpty());
        System.out.println(str2.isBlank());

        String str3 = "        65          98";
        System.out.println(str3.strip());
        System.out.println(str3.replaceAll("\\s+",""));

        String xss = "<script> alert() </script>";
        System.out.println(xss.replaceAll("</?script>",""));

        String str4 ="5483,-(43lk$# 34>?Cvm";
        String[] strArr = str4.split("\\D+");
        System.out.println(Arrays.toString(strArr));

        String str5 = String.join("; ", "a", "b", "c", "d");
        System.out.println(str5);

        String formatString = "We are printing double variable (%f), string (\"%s\") and integer variable (%d).";
        System.out.println(String.format(formatString, 0.7, "Java", 10));

    }
}
