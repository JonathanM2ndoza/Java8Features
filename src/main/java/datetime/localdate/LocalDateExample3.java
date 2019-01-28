package datetime.localdate;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateExample3 {
    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.of(2019, Month.JANUARY, 1);
        LocalDate localDate3 = LocalDate.of(2016, Month.MAY, 15);

        System.out.println(localDate1);
        // isEqual() example
        if (localDate1.isEqual(localDate2)) {
            System.out.println("localDate1 and localDate2 are equal");
        } else {
            System.out.println("localDate1 and localDate2 are not equal");
        }

        // ifAfter() example
        if (localDate2.isAfter(localDate3)) {
            System.out.println("localDate2 comes after localDate3");
        }

        // isBefore() example
        if (localDate3.isBefore(localDate1)) {
            System.out.println("localDate3 comes before localDate1");
        }
    }
}
