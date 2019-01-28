package datetime.localdate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//How to convert string to LocalDate in java
public class LocalDateExample6 {
    public static void main(String[] args) {
        // ISO Date
        LocalDate localDate = LocalDate.parse("2017-05-03",
                DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(localDate);

        // yyyy/MM/dd pattern
        LocalDate localDate1 = LocalDate.parse("2017/05/12",
                DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println(localDate1);

        // MMMM dd, yyyy pattern
        LocalDate localDate2 = LocalDate.parse("enero 01, 2019",
                DateTimeFormatter.ofPattern("MMMM dd, yyyy"));
        System.out.println(localDate2);

        // dd-MMM-yyyy pattern
        LocalDate localDate3 = LocalDate.parse("12-ene-2019",
                DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
        System.out.println(localDate3);

        // dd-LL-yyyy pattern
        LocalDate localDate4 = LocalDate.parse("12-01-2017",
                DateTimeFormatter.ofPattern("dd-LL-yyyy"));
        System.out.println(localDate4);
    }
}
