package datetime.summary;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ConvertStringToLocalDate {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
    private static final DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("d-MMM-yyyy");
    private static final DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("d/MM/yyyy");

    public static void main(String[] args) {

        System.out.println(formatter.format(LocalDate.parse("16/08/2016", formatter)));
        System.out.println(formatter2.format(LocalDate.parse("16/08/2016", formatter2)));
        System.out.println(formatter1.format(LocalDate.parse("16-ago-2016", formatter1)));


        //Convert LocalDateTime to Time Zone ISO8601 String
        LocalDateTime ldt = LocalDateTime.now();
        ZonedDateTime zdt = ldt.atZone(ZoneOffset.UTC); //you might use a different zone
        String iso8601 = zdt.toString();
        System.out.println(iso8601);
        //Convert from ISO8601 String back to a LocalDateTime
        ZonedDateTime zdt2 = ZonedDateTime.parse(iso8601);
        LocalDateTime ldt2 = zdt2.toLocalDateTime();
        System.out.println(ldt2);
    }
}
