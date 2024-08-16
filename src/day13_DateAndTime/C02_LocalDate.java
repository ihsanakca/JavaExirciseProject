package day13_DateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class C02_LocalDate {
    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();
        System.out.println("tarih = " + tarih);

        System.out.println("tarih.isLeapYear() = " + tarih.isLeapYear());

        System.out.println("tarih.plusMonths(2) = " + tarih.plusMonths(2));
        System.out.println("tarih.plusMonths(13) = " + tarih.plusMonths(13));

        System.out.println("tarih = " + tarih);  //immutable

        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek());
        System.out.println("tarih.getYear() = " + tarih.getYear());
        System.out.println("tarih.getMonth() = " + tarih.getMonth());
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue());

        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());

        //hangi gün doğdunuz
        LocalDate dogum = LocalDate.of(1997,1,7);
        System.out.println("dogum.getDayOfWeek() = " + dogum.getDayOfWeek());

        System.out.println("dogum.isBefore(tarih) = " + dogum.isBefore(tarih));
        System.out.println("dogum.isAfter(tarih) = " + dogum.isAfter(tarih));


    }
}
