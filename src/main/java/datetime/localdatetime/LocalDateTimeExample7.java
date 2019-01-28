package datetime.localdatetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

//How to convert or parse String to LocalDateTime in java
public class LocalDateTimeExample7 {
    public static void main(String[] args) {
        // ISO date time
        LocalDateTime dateTime1 = LocalDateTime.parse("2019-01-30T10:30:45",
                DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println(dateTime1);

        // 'yyyy-MMMM-dd HH:mm:ss' pattern - Idioma Local
        LocalDateTime dateTime2 = LocalDateTime.parse("2019-enero-01 23:35:05",
                DateTimeFormatter.ofPattern("yyyy-MMMM-dd HH:mm:ss"));
        System.out.println(dateTime2);

        // 'yyyy-MM-dd KK:mm:ss a' pattern
        LocalDateTime dateTime3 = LocalDateTime.parse("2019-05-30 10:20:30 AM",
                DateTimeFormatter.ofPattern("yyyy-MM-dd KK:mm:ss a"));
        System.out.println(dateTime3);

        // 'cccc, MMMM dd, yyyy KK:mm a' pattern
        LocalDateTime dateTime4 = LocalDateTime.parse("martes, enero 01, 2019 10:21 PM",
                DateTimeFormatter.ofPattern("cccc, MMMM dd, yyyy KK:mm a"));
        System.out.println(dateTime4);

        /**
         * Revisión del patron  'yyyy-MMMM-dd HH:mm:ss'
         */
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy KK:mm:ss a");
        System.out.println(dateTimeFormatter.format(localDateTime));

        //'yyyy-MMMM-dd HH:mm:ss' pattern - English
        LocalDateTime dateTime5 = LocalDateTime.parse("2019-January-03 23:35:05",
                DateTimeFormatter.ofPattern(("yyyy-MMMM-dd HH:mm:ss"), new Locale(Locale.US.getLanguage())));
        System.out.println(dateTime5);





    }
}
