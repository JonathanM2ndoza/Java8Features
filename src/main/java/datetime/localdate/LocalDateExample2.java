package datetime.localdate;

import java.time.LocalDate;

public class LocalDateExample2 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        // LocalDate's plus methods
        System.out.println("Addition of days : " + localDate.plusDays(5));
        System.out.println("Addition of months : " + localDate.plusMonths(15));
        System.out.println("Addition of weeks : " + localDate.plusWeeks(45));
        System.out.println("Addition of years : " + localDate.plusYears(5));

        // LocalDate's minus methods
        System.out.println("Subtraction of days : " + localDate.minusDays(5));
        System.out.println("Subtraction of months : " + localDate.minusMonths(15));
        System.out.println("Subtraction of weeks : " + localDate.minusWeeks(45));
        System.out.println("Subtraction of years : " + localDate.minusYears(5));
    }
}
