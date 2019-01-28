package datetime.localdatetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//How to convert or format LocalDateTime to String in java
public class LocalDateTimeExample8 {
    public static void main(String[] args) {

        // ISO date time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime.format(
                DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        // 'yyyy-MMM-dd HH:mm:ss' pattern
        System.out.println(dateTime.format(
                DateTimeFormatter.ofPattern("yyyy-MMM-dd HH:mm:ss")));

        // 'yyyy-MM-dd KK:mm:ss a' pattern
        System.out.println(dateTime.format(
                DateTimeFormatter.ofPattern("yyyy-MM-dd KK:mm:ss a")));

        // 'cccc, MMMM dd, yyyy KK:mm a' pattern
        System.out.println(dateTime.format(
                DateTimeFormatter.ofPattern("cccc, MMMM dd, yyyy KK:mm a")));


        System.out.println(dateTime.format(
                DateTimeFormatter.ofPattern("dd-MMMM-yyyy KK:mm a")));
    }
}
