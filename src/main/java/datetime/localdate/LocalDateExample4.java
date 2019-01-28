package datetime.localdate;

import java.time.LocalDate;
import java.time.Month;

//How to get number of days in a month or year using LocalDate
public class LocalDateExample4 {
    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.of(2019, Month.JANUARY, 1);
        LocalDate localDate2 = LocalDate.of(2016, Month.FEBRUARY, 1);

        // Number of days in a month
        System.out.println("Number of days in " + localDate1.getMonth() + " : "
                + localDate1.lengthOfMonth());
        System.out.println("Number of days in " + localDate2.getMonth() + " : "
                + localDate2.lengthOfMonth());

        // Number of days in a year
        System.out.println("Number of days in " + localDate1.getYear() + " : "
                +localDate1.lengthOfYear());
        System.out.println("Number of days in " + localDate2.getYear() + " : "
                +localDate2.lengthOfYear());
    }
}
