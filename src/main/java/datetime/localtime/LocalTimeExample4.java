package datetime.localtime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

//How to convert String to LocalTime in java
public class LocalTimeExample4 {
    public static void main(String[] args) {
        LocalTime isoTime = LocalTime.parse("23:15:30",
                DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println(isoTime);

        // hour-of-day (0-23)
        LocalTime localTime = LocalTime.parse("22:45:30",
                DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(localTime);

        // clock-hour-of-am-pm (1-24)
        LocalTime localTime2 = LocalTime.parse("21:45:30",
                DateTimeFormatter.ofPattern("kk:mm:ss"));
        System.out.println(localTime2);

        // clock-hour-of-am-pm (1-12)
        LocalTime localTime3 = LocalTime.parse("10:45:30 PM",
                DateTimeFormatter.ofPattern("hh:mm:ss a"));
        System.out.println(localTime3);

        // hour-of-am-pm (0-11)
        LocalTime localTime4 = LocalTime.parse("10:45:30 AM",
                DateTimeFormatter.ofPattern("KK:mm:ss a"));
        System.out.println(localTime4);
    }
}
