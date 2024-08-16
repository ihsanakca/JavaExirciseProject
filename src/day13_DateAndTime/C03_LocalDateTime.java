package day13_DateAndTime;

import java.time.LocalDateTime;
import java.time.Month;

public class C03_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();

        System.out.println("ldt = " + ldt);

        LocalDateTime localDateTime = LocalDateTime.of(1988, Month.APRIL, 21, 20, 15, 22);
        System.out.println("localDateTime = " + localDateTime);
    }
}
