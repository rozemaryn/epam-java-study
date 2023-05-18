package com.kostyanetskaya.epamjavastudy.lesson3;

import java.util.Locale;

public class LearnMainSwitch {
    public static int defineLevel (String role) {
        int level;
        switch (role.toLowerCase(Locale.ROOT)) {
            case "guest": level = 0;
            break;
            case "client": level = 1;
                break;
            case "moderator": level = 2;
                break;
            case "admin": level = 3;
                break;
            default: throw new IllegalArgumentException("non-authentic role = " + role);
        }
        return level;
    }


    public static void main(String[] args) {
        byte value = 2;
        final byte RANGE = 127;

        switch (value) {
            case 2: //code a
            case 3: //code b
            case 4: // more code 1
                break;
            case RANGE: // more code 2
                break;
            case 0: // more code 3
                break;
            default: // more code 4
        }
    }
}
