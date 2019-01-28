package datetime.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeExample5 {
    public static void main(String[] args) {
        //How to convert LocalDateTime to LocalDate in Java
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("LocalDateTime: " + dateTime);
        LocalDate localDate = dateTime.toLocalDate();
        System.out.println("LocalDate: " + localDate);

        //How to convert LocalDateTime to LocalTime in Java
        LocalDateTime dateTime2 = LocalDateTime.now();
        System.out.println("LocalDateTime: " +dateTime2);
        LocalTime localDate2 = dateTime2.toLocalTime();
        System.out.println("LocalTime: "+localDate2);

    }
}
