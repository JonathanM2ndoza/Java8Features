package datetime.localdatetime;

import java.time.LocalDateTime;

public class LocalDateTimeExample3 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        // LocalDateTime's plus methods
        System.out.println("Addition of days : " + dateTime.plusDays(5));
        System.out.println("Addition of months : " + dateTime.plusMonths(15));
        System.out.println("Addition of years : " + dateTime.plusYears(5));
        System.out.println("Addition of Hours : " + dateTime.plusHours(2));
        System.out.println("Addition of Minutes : " + dateTime.plusMinutes(30));
        System.out.println("Addition of Seconds : " + dateTime.plusSeconds(20));

        // LocalDateTime's minus methods
        System.out.println("Subtraction of days : " + dateTime.minusDays(5));
        System.out.println("Subtraction of months : " + dateTime.minusMonths(15));
        System.out.println("Subtraction of years : " + dateTime.minusYears(5));
        System.out.println("Subtraction of Hours : " + dateTime.minusHours(2));
        System.out.println("Subtraction of Minutes : " + dateTime.minusMinutes(30));
        System.out.println("Subtraction of Seconds : " + dateTime.minusSeconds(20));

    }
}
