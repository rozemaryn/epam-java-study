package com.kostyanetskaya.epamjavastudy.lesson9;

public class StringMain {
    static String str = "hello";

    public static void main(String[] args) {
        String str1 = "hello";
        System.out.println(str==str1);

        char[] chars = {'j','a','v','a'};
        System.out.println(new String(chars));

        byte[] bytes = {58, 45, 63, 90};
        System.out.println(new String(bytes));

        String str2 = "java" + 1 + Integer.parseInt("2");
        System.out.println(str2); // java12
        String str3 = 1 + Integer.parseInt("2") + "java" + false + null;
        System.out.println(str3); //3java

        str1+=str2;
        System.out.println(str1);
    }
}

class MethodExample1 {
    public static void main(String[] args) {
        String str = "Software And Hardware!";
        int start = 9;
        int end = 12;
        char[] dst = new char[end - start];
        str.getChars(start, end, dst, 0);
        System.out.println(dst);
    }
}

class MethodExample2 {
    public static void main(String[] args) {
        String str = "String in java is a sequence of characters java";
        int i1 = str.indexOf("java");
        int i2 = str.lastIndexOf("java");
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(str.indexOf("java", 20));
    }
}
class MethodExample3 {
    public static void main(String[] args) {
        String str1 = "Learn Java";
        String str2 = "Cool avatar!";
        boolean result = str1.regionMatches(7, str2, 5, 3);
        System.out.println(result);
    }
}