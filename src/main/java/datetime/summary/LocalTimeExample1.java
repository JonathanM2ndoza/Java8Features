package datetime.summary;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeExample1 {
    public static void main(String[] args) {
        // ISO pattern
        ZonedDateTime dateTime = ZonedDateTime.now();
        System.out.println(dateTime.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));

        // 'yyyy-MMM-dd HH:mm:ss z' pattern
        System.out.println(
                dateTime.format(DateTimeFormatter.ofPattern("yyyy-MMM-dd HH:mm:ss z")));

        // 'yyyy-MM-dd KK:mm:ss a' pattern
        System.out.println(
                dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd KK:mm:ss a")));

        // 'cccc, MMMM dd, yyyy KK:mm a' pattern
        System.out.println(
                dateTime.format(DateTimeFormatter.ofPattern("cccc, MMMM dd, yyyy KK:mm a")));
    }
}
