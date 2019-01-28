package datetime.summary;

import java.time.*;

/**
 * The java.time.OffsetDateTime class is an immutable class which represents a date-time with an offset such as '2017-07-03T21:44:49.468+05:30'.
 */
public class OffsetDateTimeExample1 {
    public static void main(String[] args) {
        // Current date time with an offset
        OffsetDateTime dateTime = OffsetDateTime.now();
        System.out.println(dateTime);

        // Current date time from specified clock with an offset
        OffsetDateTime dateTime2 = OffsetDateTime.now(Clock.systemDefaultZone());
        System.out.println(dateTime2);

        // Current date time from specified time-zone with an offset
        OffsetDateTime dateTime3 = OffsetDateTime.now(ZoneId.systemDefault());
        System.out.println(dateTime3);

        // Specific date time from LocalDateTime with an offset
        OffsetDateTime dateTime4 = OffsetDateTime.of(LocalDateTime.of(2017, 05, 12, 05, 45),
                ZoneOffset.ofHoursMinutes(6, 30));
        System.out.println(dateTime4);
    }
}
