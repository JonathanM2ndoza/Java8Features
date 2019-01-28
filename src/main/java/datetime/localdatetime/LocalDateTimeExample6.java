package datetime.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class LocalDateTimeExample6 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        //How to get number of days in a month or year using LocalDateTime
        // Convert LocalDateTime to LocalDate
        LocalDate localDate = dateTime.toLocalDate();
        // Number of days in a month
        System.out.println("Number of days in " + localDate.getMonth() + " : "
                + localDate.lengthOfMonth());
        // Number of days in a year
        System.out.println("Number of days in " + localDate.getYear() + " : "
                + localDate.lengthOfYear());

        //How to check if a given year is leap year (366 days) or not using LocalDateTime
        if (localDate.isLeapYear()) {
            System.out.println(localDate.getYear() + " is a leap year");
        } else {
            System.out.println(localDate.getYear() + " is not a leap year");
        }

    }
}
