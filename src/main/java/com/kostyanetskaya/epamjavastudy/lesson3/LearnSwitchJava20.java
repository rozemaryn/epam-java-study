package com.kostyanetskaya.epamjavastudy.lesson3;

public class LearnSwitchJava20 {
    public static int defineLevel(String role) {
        return switch (role) {
            case "guest" -> 0;
            case "client" -> 1;
            case "moderator" -> 2;
            case "admin" -> 3;
            default -> {
                System.out.println("non-authentic role = " + role);
                yield -1;
            }
        };
    }

    public static void main(String[] args) {
        int level = defineLevel("clients");
        System.out.println(level);

        int value = 777;
        switch (value) {
            case 1, 2, 3, 4 -> System.out.println("1, 2, 3 or 4");
            case 777 -> System.out.println("Range: " + value);
            case 0 -> System.out.println("0");
            default -> System.out.println("Default");
        }

        String day = new String("SAT");
        switch (day) {
            case "MON", "TUE", "WED", "THU" -> System.out.println("Time to work");
            case "FRI" -> System.out.println("Nearing weekend");
            case "SAT", "SUN" -> System.out.println("Weekend!");
            default -> System.out.println("Invalid day?");
        }
    }
}

class AnotherSwitchExmp {

    static int method(int number) {
        return switch (number) {
            case 1, 2, 3 -> number *= 3;
            case 7 -> number *= 4;
            case 4 -> number *= 5;
            default -> number += 100;
        };
    }

    public static void main(String[] args) {
        var number = 10;
        System.out.println(switch (number) {
            case 1, 2, 3 -> number *= 3;
            case 7 -> number *= 4;
            case 4 -> number *= 5;
            default -> {
                System.out.println(number);
                yield number += 100;
            }
        });

        int result = method(number);
        System.out.println(result);


    }
}


