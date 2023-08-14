package com.kostyanetskaya.epamjavastudy.lesson9.tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColorCodeValidation {
    /*
    Реализуйте метод validateColorCode в ColorCodeValidation
    Он проверяет входную строку на соответствие правилам написания HTML Color Codes.
     */
    public static boolean validateColorCode(String color) {

        if (color == null) {
            return false;
        }

        Pattern p1 = Pattern.compile("#\\d{6}");
        Pattern p2 = Pattern.compile("#\\d{3}");
        Pattern p3 = Pattern.compile("#(\\d[a-fA-F]){3}");
        Pattern p4 = Pattern.compile("#[a-fA-F]{6}");
        Pattern p5 = Pattern.compile("#[a-fA-F]{3}");

        Pattern[] correctCodes = {p1, p2, p3, p4, p5};

        for (Pattern p: correctCodes) {
            Matcher m = p.matcher(color);
            if (m.matches()) {
                return true;
            }
        }
        return false;
    }
}
