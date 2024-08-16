package day00_GeneralUsage;

import java.util.Scanner;

public class ReversedNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir tam sayı giriniz : ");

        int girilenSayi = scanner.nextInt();

        int girilenSayininTersi = 0;

        //782   ---- 287
        //2
        //2*10+8 =28
        //28*10+7 = 287

        do {
            int sonRakam = girilenSayi % 10;
            girilenSayininTersi = girilenSayininTersi*10+sonRakam;
            girilenSayi /=10;  // girilenSayi = girilenSayi/10;
        } while (girilenSayi != 0);

        System.out.println("girilenSayininTersi = " + girilenSayininTersi);
    }


}
