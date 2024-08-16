package day13_DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class C04_DateTimeFormatter {
    public static void main(String[] args) {

        /**
         * Java tarih ve zamanı kendi formatında oluşturur
         * Ama istediğimiz formata dönüştürmemize izin verir.
         *
         * Format oluştururken
         * GÜN
         * d : başta 0 varsa onu yazmadan gün numarası
         * dd : tek haneli günleri 01 gibi başına sıfır yazarak gün numarası
         * DDD : yılın kaçıncı günü olduğunu yazar
         * E, EE, EEE : gün isminin ilk 3 harfi
         * EEEE : gün isminin tamamı
         *
         * AY (Ay için M, dakika için m kullanılır)
         *  M : başta 0 varsa onu yazmadan ay numarası
         *  MM : tek haneli aylarda 01 gibi başına 0 yazarak ay numarasını
         *  MMM : Ay isminin ilk 3 harfi
         *  MMMM : Ay isminin tamamı
         *
         *  YIL
         *  yy : yılın son iki rakamı
        *  yyyy : yılın tamamını
         *
         *  Saat : ( 24 saat üzerinden isriyorsak H, 12 saat düzeninde istiyorsak h)
         *  HH : saatin tamamı, tek haneli olursa 02 gibi
         *  H : Tek haneli saat olursa sadece saati
         *  a yazarsak AM veya PM değerini yazar.
         */

        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd / MM / yyyy * HH:mm");

        System.out.println("now.format(dtf1) = " + now.format(dtf1));

        LocalDateTime dogum = LocalDateTime.of(1977, 5, 6, 23, 21, 32, 3633);

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEE hh:mm a");
        System.out.println("dogum.format(dtf2) = " + dogum.format(dtf2));

        System.out.println("dtf2.format(dogum) = " + dtf2.format(dogum));

        System.out.println("--------------------------------");

        LocalDate dogumGunu = LocalDate.of(1977, 6, 5);
        LocalDate simdi = LocalDate.now();

        System.out.println("Period.between(dogum,now) = " + Period.between(dogumGunu, simdi));
        System.out.println("Period.between(dogumGunu,simdi).getYears() = " + Period.between(dogumGunu, simdi).getYears());
        System.out.println("Period.between(dogumGunu,simdi).getMonths() = " + Period.between(dogumGunu, simdi).getMonths());

        System.out.println("ChronoUnit.MONTHS.between(dogumGunu,simdi) = " + ChronoUnit.MONTHS.between(dogumGunu,
                simdi));

        System.out.println("ChronoUnit.DAYS.between(dogumGunu,simdi) = " + ChronoUnit.DAYS.between(dogumGunu,
                simdi));


        LocalDateTime tokyo = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("tokyo = " + tokyo);


        String str = "Ahmet";

        char[] charArray = str.toCharArray();

        System.out.println("charArray = " + charArray);

        System.out.println(Arrays.toString(charArray));

        for (int i = 0; i<charArray.length;i++){
            System.out.print(charArray[i]+" ");
        }

    }
}
