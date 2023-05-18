package com.kostyanetskaya.epamjavastudy.lesson2;
import java.time.Duration;

/*
Перейдите в класс ElectronicWatch и напишите программу, которая получает на вход целое число.
Это число представляет собой текущее суточное время как количество прошедших с полнуочи секунд.
Затем программа должна напечатать вывод экрана электронных часов для этого времени.

Гарантируется, что входное значение — неотрицательное.

Формат вывода: h:mm:ss (возможные значения: [0:00:00; 23:59:59]).

Усложненный вариант: попробуйте решить задачу без использования if и циклов.
 */

public class ElectronicWatch {
    public static String whatTimeItIs (int seconds) {

        Duration duration = Duration.ofSeconds(seconds);

        long HH = duration.toHoursPart();
        long MM = duration.toMinutesPart();
        long SS = duration.toSecondsPart();

        String time = String.format("%01d:%02d:%02d", HH, MM, SS);

       return time;
    }

    public static void main(String[] args) {
        int i = 89999;
        String time = whatTimeItIs(i);
        System.out.println(time);
    }
}

class ElectronicWatchAnotherSolution {
    public static String whatTimeItIs (int seconds) {

        long HH = (seconds / 3600) % 24;
        long MM = (seconds%3600) / 60;
        long SS = seconds%60;

        String time = String.format("%01d:%02d:%02d", HH, MM, SS);
        return time;
    }

    public static void main(String[] args) {
        int i = 600;
        String time = whatTimeItIs(i);
        System.out.println(time);
    }
}

