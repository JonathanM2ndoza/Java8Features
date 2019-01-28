package datetime.localdate;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class LocalDateExample1 {
    public static void main(String[] args) {
        // Current date
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        //Specific date
        LocalDate localDate2 = LocalDate.of(2017, Month.MAY, 15);
        System.out.println(localDate2);

        //How to get year, month, day from LocalDate
        System.out.println("Year : " + localDate.getYear());
        System.out.println("Month : " + localDate.getMonth().getValue());
        System.out.println("Day of Month : " + localDate.getDayOfMonth());
        System.out.println("Day of Week : " + localDate.getDayOfWeek());
        System.out.println("Day of Year : " + localDate.getDayOfYear());
    }
}
