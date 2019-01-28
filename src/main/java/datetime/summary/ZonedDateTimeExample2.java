package datetime.summary;

import java.time.ZonedDateTime;

public class ZonedDateTimeExample2 {
    public static void main(String[] args) {
        ZonedDateTime dateTime = ZonedDateTime.now();

        System.out.println("Year : " + dateTime.getYear());
        System.out.println("Month : " + dateTime.getMonth().getValue());
        System.out.println("Day of Month : " + dateTime.getDayOfMonth());
        System.out.println("Day of Week : " + dateTime.getDayOfWeek());
        System.out.println("Day of Year : " + dateTime.getDayOfYear());
        System.out.println("Zone Id : " + dateTime.getZone());
        System.out.println("Offset : " + dateTime.getOffset());
    }
}
