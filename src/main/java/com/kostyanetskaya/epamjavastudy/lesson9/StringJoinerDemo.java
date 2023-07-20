package com.kostyanetskaya.epamjavastudy.lesson9;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(":", "<<", ">>");
        String result = joiner.add("blanc").add("rouge").add("blanc").toString();
        System.out.println(result);
    }
}
