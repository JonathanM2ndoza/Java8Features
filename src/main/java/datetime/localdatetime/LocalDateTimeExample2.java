package datetime.localdatetime;

import java.time.LocalDateTime;

public class LocalDateTimeExample2 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        //How to get year, month, day from LocalDateTime
        System.out.println("Year : " + dateTime.getYear());
        System.out.println("Month : " + dateTime.getMonth().getValue());
        System.out.println("Day of Month : " + dateTime.getDayOfMonth());
        System.out.println("Day of Week : " + dateTime.getDayOfWeek());
        System.out.println("Day of Year : " + dateTime.getDayOfYear());

        //How to get Hour, Minute, Second from LocalDateTime
        System.out.println("Hour : " + dateTime.getHour());
        System.out.println("Minute : " + dateTime.getMinute());
        System.out.println("Second : " + dateTime.getSecond());
        System.out.println("Nano : "+dateTime.getNano());
    }
}
