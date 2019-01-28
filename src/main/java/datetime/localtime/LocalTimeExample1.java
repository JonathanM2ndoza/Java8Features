package datetime.localtime;

import java.time.LocalTime;

public class LocalTimeExample1 {
    public static void main(String[] args) {
        // Current Time
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        // Specific Time
        LocalTime localTime2 = LocalTime.of(4, 30, 45);
        System.out.println(localTime2);

        //How to get Hour, Minute, Second from LocalTime
        System.out.println("Hour : " + localTime.getHour());
        System.out.println("Minute : " + localTime.getMinute());
        System.out.println("Second : " + localTime.getSecond());
    }
}
