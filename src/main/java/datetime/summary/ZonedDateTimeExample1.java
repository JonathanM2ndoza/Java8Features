package datetime.summary;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * The java.time.ZonedDateTime class is an immutable class which represents a date-time with time-zone information such as ‘2017-06-16T21:25:37.258+05:30[Asia/Calcutta]’.
 */
public class ZonedDateTimeExample1 {
    public static void main(String[] args) {
        // Current date time
        ZonedDateTime dateTime1 = ZonedDateTime.now();
        System.out.println(dateTime1);

        // Current date time from specified time-zone
        ZonedDateTime dateTime2 = ZonedDateTime.now(ZoneId.of("UTC-4"));
        System.out.println(dateTime2);

        // Current date time from specified clock
        ZonedDateTime dateTime3 = ZonedDateTime.now(Clock.systemDefaultZone());
        System.out.println(dateTime3);

        // Current zoned date time from LocalDateTime
        ZonedDateTime dateTime4 = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("GMT"));
        System.out.println(dateTime4);

        // Specific zoned date time from LocalDateTime
        ZonedDateTime dateTime5 = ZonedDateTime.of(LocalDateTime.of(2017, 05, 12, 05, 45),
                ZoneId.of("Europe/London"));
        System.out.println(dateTime5);
    }
}
