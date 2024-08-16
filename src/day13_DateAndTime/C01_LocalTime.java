package day13_DateAndTime;

import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {

        LocalTime saat = LocalTime.now();  // canlı saat değildir.

        System.out.println("saat = " + saat);

        //birden 100.000 kadar sayıların toplamını ve toplanma süresini bulunuz

        int toplam = 0;

        int start = saat.getNano();

        for (int i = 1; i <= 100000; i++) {
            toplam += i;
        }
        LocalTime saatSon = LocalTime.now();
        int finish = saatSon.getNano();

        System.out.println(finish - start);

        System.out.println("toplam = " + toplam);

        //20:15

        LocalTime belirliSaat = LocalTime.of(20, 15, 23, 36336);
        System.out.println("belirliSaat = " + belirliSaat);

        System.out.println("belirliSaat.getHour() = " + belirliSaat.getHour());

        System.out.println("belirliSaat.compareTo(saat) = " + belirliSaat.compareTo(saat)); // eşitse 0 değilse -1

        System.out.println("belirliSaat.isBefore(saat) = " + belirliSaat.isBefore(saat));
        System.out.println("belirliSaat.isAfter(saatSon) = " + belirliSaat.isAfter(saatSon));

        LocalTime time1 = LocalTime.of(20, 15);
        LocalTime time2 = LocalTime.of(20, 15, 25);
        LocalTime time3 = LocalTime.of(20, 15, 25, 3332323);

        LocalTime now = LocalTime.now();
        System.out.println("now.toSecondOfDay() = " + now.toSecondOfDay());
        System.out.println("now.plusMinutes(15) = " + now.plusMinutes(15));
    }
}
