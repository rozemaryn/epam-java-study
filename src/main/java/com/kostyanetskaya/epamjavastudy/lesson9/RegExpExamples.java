package com.kostyanetskaya.epamjavastudy.lesson9;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpExamples {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("abc");
        System.out.println(pattern.flags());
        Pattern otherPattern = Pattern.compile("abc", Pattern.CASE_INSENSITIVE);
        System.out.println(otherPattern.flags());

        String str1 = "Один два,три!четыре;пять шесть.семь";
        Pattern p1 = Pattern.compile("[ ,!;.]");
        String s[] = p1.split(str1);
        System.out.println("Исходная строка -> " + str1);
        for (String i : s) {
            System.out.println("Лексема: " + i);

            String str2 = "Один два,три!четыре;пять шесть.семь";
            Pattern p2 = Pattern.compile("[ ,!;.]");
            String s2[] = p2.split(str2, 2);
            System.out.println("Исходная строка -> " + str2);
            for (String i2 : s2)
                System.out.println("Лексема: " + i2);
        }
    }
}

class Example2 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("java");
        String[] result = pattern.split("dfjava13 0- java54648f", 1);
        System.out.println(Arrays.toString(result));

        boolean match = Pattern.matches("y+z", "yyz");
        System.out.println(match);
        System.out.println(Pattern.matches("y?z", "z"));

    }
}

class Example3 {
    public static void main(String[] args) {
        String text = "This is my second java 45 project.\n" +
                "It is wonderful to learn polysemantics and arrays.\n" +
                "The weather is cold like it should be in winter, but we are all looking forward to spring.";
        Pattern p = Pattern.compile("\\b[\\w]{2}\\b");
        Matcher m = p.matcher(text);

        while (m.find()) {
            int start = m.start();
            int end = m.end();
            System.out.println("Found matches " + text.substring(start, end) + " from " + start + " to " + (end - 1) + " positions");
        }
    }
}

class Example4 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\w*");
        Matcher m = p.matcher("Thanks!");
        System.out.println(m.matches());
        System.out.println(m.lookingAt());
    }
}

class Example5 {
    public static void main(String[] args) {
        String text = "This is my second java 45 project.\n" +
                "It is wonderful to learn polysemantics and arrays.\n" +
                "The weather is cold like it should be in winter, but we are all looking forward to spring.";
        System.out.println("Before:\n" + text);
        Pattern p = Pattern.compile("\\b[\\w]{2}\\b");
        Matcher m = p.matcher(text);
        text = m.replaceFirst("lab2");
        System.out.println("\nAfter:\n" + text);

        text = m.replaceAll("lab2");
        System.out.println("\nAfter full replacement:\n" + text);
    }
}
