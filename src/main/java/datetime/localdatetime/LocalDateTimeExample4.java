package datetime.localdatetime;

import java.time.LocalDateTime;

//How to compare LocalDateTime objects in Java
public class LocalDateTimeExample4 {
    public static void main(String[] args) {
        LocalDateTime dateTime1 = LocalDateTime.of(2019, 05, 22, 10, 55, 25);
        LocalDateTime dateTime2 = LocalDateTime.of(2019, 06, 11, 05, 35, 26);
        LocalDateTime dateTime3 = LocalDateTime.of(2019, 05, 22, 10, 55, 25);

        // Using isBefore() method
        if (dateTime1.isBefore(dateTime2)) {
            System.out.println("dateTime1 is before dateTime2");
        }

        // Using isAfter() method
        if (dateTime2.isAfter(dateTime3)) {
            System.out.println("dateTime2 is after dateTime3");
        }

        // Using isEqual() method
        if (dateTime1.isEqual(dateTime3)) {
            System.out.println("dateTime1 is equal to dateTime3");
        }

        // Using compareTo() method
        if (dateTime1.compareTo(dateTime3) == 0) {
            System.out.println("dateTime1 is equal to dateTime3");
        }
    }
}
