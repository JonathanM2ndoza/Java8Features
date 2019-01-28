package datetime.localtime;

import java.time.LocalTime;

public class LocalTimeExample2 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println("Current Time : " + localTime);

        // LocalTime's plus methods
        System.out.println("Addition of Hours : " + localTime.plusHours(2));
        System.out.println("Addition of Minutes : " + localTime.plusMinutes(30));
        System.out.println("Addition of Seconds : " + localTime.plusSeconds(20));
        System.out.println("Addition of Nanos : " + localTime.plusNanos(60000));

        // LocalTime's minus methods
        System.out.println("Subtraction  of Hours : " + localTime.minusHours(2));
        System.out.println("Subtraction  of Minutes : " + localTime.minusMinutes(30));
        System.out.println("Subtraction  of Seconds : " + localTime.minusSeconds(20));
        System.out.println("Subtraction  of Nanos : " + localTime.minusNanos(60000));
    }
}
