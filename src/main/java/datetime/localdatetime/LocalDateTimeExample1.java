package datetime.localdatetime;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;

public class LocalDateTimeExample1 {
    public static void main(String[] args) {
        // Current date time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        // Current date time from specified time-zone
        LocalDateTime dateTime2 = LocalDateTime.now(ZoneId.of("UTC-4"));
        System.out.println(dateTime2);

        // Current date time from specified clock
        LocalDateTime dateTime3 = LocalDateTime.now(Clock.systemUTC());
        System.out.println(dateTime3);

        // Specific date time
        LocalDateTime dateTime4 = LocalDateTime.of(2018, Month.DECEMBER, 31, 20, 48, 55);
        System.out.println(dateTime4);
    }
}
