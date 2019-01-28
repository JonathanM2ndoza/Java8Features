package datetime.localdate;

import java.time.LocalDate;
import java.time.Month;

//How to check if a given year is leap year or not using LocalDate
public class LocalDateExample5 {
    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.of(2019, Month.JANUARY, 1);
        LocalDate localDate2 = LocalDate.of(2016, Month.JANUARY, 1);

        if(localDate1.isLeapYear()){
            System.out.println(localDate1.getYear()+ " is a leap year");
        }else{
            System.out.println(localDate1.getYear()+ " is not a leap year");
        }

        if(localDate2.isLeapYear()){
            System.out.println(localDate2.getYear()+ " is a leap year");
        }else{
            System.out.println(localDate2.getYear()+ " is not a leap year");
        }
    }
}
