package com.kostyanetskaya.epamjavastudy.lesson9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherDemo {
    public static void main(String[] args) {
        String mailRegex = "\\w{6,}@\\w+\\.\\p{Lower}{2,4}";
        String input = "e-mail's:blinov@gmai.com, romanhcik@bsu.by!";
        Pattern pattern = Pattern.compile(mailRegex);
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()) {
            System.out.println(matcher.start());
            System.out.println(matcher.group());
            System.out.println(matcher.end());
        }

        System.out.println(matcher.replaceAll("-------"));


        Pattern pattern1 = Pattern.compile("e-mail");
        Matcher matcher1 = pattern1.matcher(input);
        System.out.println(matcher1.lookingAt());
        System.out.println(matcher1.matches());
    }
}
