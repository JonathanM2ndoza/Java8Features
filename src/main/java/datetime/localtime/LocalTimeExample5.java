package datetime.localtime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

//How to convert LocalTime to String in java
public class LocalTimeExample5 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();

        // ISO Format
        DateTimeFormatter timeFormatter = DateTimeFormatter.ISO_LOCAL_TIME;
        System.out.println(localTime.format(timeFormatter));

        // hour-of-day (0-23)
        DateTimeFormatter timeFormatter1 = DateTimeFormatter
                .ofPattern("HH:mm:ss");
        System.out.println(localTime.format(timeFormatter1));

        // clock-hour-of-am-pm (1-24)
        DateTimeFormatter timeFormatter2 = DateTimeFormatter
                .ofPattern("kk:mm:ss");
        System.out.println(localTime.format(timeFormatter2));

        // clock-hour-of-am-pm (1-12)
        DateTimeFormatter timeFormatter3 = DateTimeFormatter
                .ofPattern("hh:mm:ss a");
        System.out.println(localTime.format(timeFormatter3));

        // hour-of-am-pm (0-11)
        DateTimeFormatter timeFormatter4 = DateTimeFormatter
                .ofPattern("KK:mm:ss a");
        System.out.println(localTime.format(timeFormatter4));
    }
}
