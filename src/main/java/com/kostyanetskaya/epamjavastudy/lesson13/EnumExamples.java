package com.kostyanetskaya.epamjavastudy.lesson13;

import java.util.Arrays;

public class EnumExamples {

}
enum DayOfWeek {
    SUNDAY ("Воскресенье"),
    MONDAY ("Понедельник"),
    TUESDAY ("Вторник"),
    WEDNESDAY ("Среда"),
    THURSDAY ("Четверг"),
    FRIDAY ("Пятница"),
    SATURDAY ("Суббота");

    private String title;

    DayOfWeek(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "DayOfWeek{" +
                "title='" + title + '\'' +
                '}';
    }
}

class ScholarSchedule {

    private DayOfWeek dayOfWeek;

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
}

class Scholar {

    private ScholarSchedule schedule;
    private boolean goToSchool;

    public void wakeUp() {

        if (this.schedule.getDayOfWeek() == DayOfWeek.SUNDAY) {
            System.out.println("Ура, можно поспать еще!");
        } else {
            System.out.println("Блин, опять в школу:(");
        }
    }

    public static void main(String[] args) {
        Scholar sh = new Scholar();
        sh.schedule = new ScholarSchedule();
        sh.schedule.setDayOfWeek(DayOfWeek.TUESDAY);
        sh.wakeUp();

        System.out.println(Arrays.toString(DayOfWeek.values()));

        int sundayIndex = DayOfWeek.SUNDAY.ordinal();
        System.out.println(sundayIndex);

        DayOfWeek wednesday = DayOfWeek.valueOf("WEDNESDAY");
        System.out.println(wednesday);

        System.out.println(DayOfWeek.class.getSuperclass());
    }
}
