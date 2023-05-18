package com.kostyanetskaya.epamjavastudy.lesson2;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class ElectronicWatch {
    public static String whatTimeItIs (int seconds) {

        Duration duration = Duration.ofSeconds(seconds);

        long HH = duration.toHoursPart();
        long MM = duration.toMinutesPart();
        long SS = duration.toSecondsPart();

        String time = String.format("%02d:%02d:%02d", HH, MM, SS);

       return time;
    }

    public static void main(String[] args) {
        int i = 86299;
        String time = whatTimeItIs(i);
        System.out.println(time);
    }
}

class ElectronicWatchAnotherSolution {

}
