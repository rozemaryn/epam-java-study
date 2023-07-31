package com.kostyanetskaya.epamjavastudy.lesson9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroupDemo {
    public static void main(String[] args) {
        String base = "java";
        groupView(base, "([a-z]*)([a-z]+)");
        groupView(base, "([a-z]?)([a-z]+)");
        groupView(base, "([a-z]+)([a-z]*)");
        groupView(base, "([a-z]?)([a-z]?)");
    }
    private static void groupView(String base, String regExp) {
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(base);
        if (matcher.matches()) {
            System.out.println("group 1: " + matcher.group(1));
            System.out.println("group 2: " + matcher.group(2));
            System.out.println("main group: " + matcher.group() + " [end]");//eq.group(0)
        } else {
            System.out.println("nothing matches");
        }
    }
}

class GroupDemo2 {
    public static void main(String[] args) {
        String input = "java";
        String regex = "([a-z]?)([a-z]+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("main group" + matcher.group());
            System.out.println("group 1: " + matcher.group(1));
            System.out.println("group 2: " + matcher.group(2));
        }
        else {
            System.out.println("nothing");
        }

        System.out.println(matcher.groupCount());
    }
}

class Test {
    public static void main(String[] args) {
        String str = "Lena, Sveta, Lulu, Natalia, lana";
        Pattern p = Pattern.compile("L.*?\\b");
        Matcher m = p.matcher(str);
        str = m.replaceAll("XXX");
        System.out.println(str);
    }
}

