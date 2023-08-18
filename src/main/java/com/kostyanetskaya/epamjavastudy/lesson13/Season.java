package com.kostyanetskaya.epamjavastudy.lesson13;

import java.util.Arrays;

public enum Season {
    WINTER, SPRING, SUMMER, AUTUMN;
    public String toString(){
        return "Season: " + this.name();
    }
}


class SeasonTest {
    public static void main(String[] args) {
        Season season = Season.SPRING;
        System.out.println(Season.class.getSuperclass());

        System.out.println(Season.WINTER.name());
        System.out.println(Season.WINTER.ordinal());

        Season[] seasons = Season.values();
        System.out.println(Arrays.toString(seasons));

        System.out.println(Season.valueOf("WINTER"));
        // Season.valueOf("Summer");

        System.out.println(Season.SPRING.compareTo(Season.WINTER));
        System.out.println(Season.SPRING.compareTo(Season.SPRING));
        System.out.println(Season.SPRING.compareTo(Season.SUMMER));
        System.out.println(Season.WINTER.compareTo(Season.SUMMER));

        boolean isEqualToItself = Season.WINTER.equals(Season.WINTER);
        boolean isEqualToDifferentSeason = Season.WINTER.equals(Season.SUMMER);
        System.out.println(isEqualToItself);
        System.out.println(isEqualToDifferentSeason);

        System.out.println(season == Season.SPRING);
        System.out.println(season == Season.SUMMER);

        int hashOfWinter = Season.WINTER.hashCode();
        int hashOfSummer = Season.SUMMER.hashCode();
        System.out.println(hashOfWinter);
        System.out.println(hashOfSummer);

        String winter = Season.WINTER.toString();
        System.out.println(winter);
    }
}
