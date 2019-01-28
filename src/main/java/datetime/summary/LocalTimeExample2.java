package datetime.summary;

import java.time.*;

public class LocalTimeExample2 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime dateTime1 = localDateTime.atZone(ZoneId.systemDefault());
        System.out.println(dateTime1);

        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        ZonedDateTime dateTime2 = offsetDateTime.atZoneSameInstant(ZoneId.of("Europe/London"));
        System.out.println(dateTime2);

        Instant instant = Instant.now();
        ZonedDateTime dateTime3 = instant.atZone(ZoneId.of("US/Pacific"));
        System.out.println(dateTime3);
    }
}
