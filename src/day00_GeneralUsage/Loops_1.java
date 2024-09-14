package day00_GeneralUsage;

import java.util.Arrays;
import java.util.Scanner;

public class Loops_1 {
    public static void main(String[] args) {
        // girilen sayının rakam değerlerini veren kod nedir;
        // 785 -- 7+8+5 = 20
        // 8702 -- 8+7+0+2 = 17


        int sayi = -55;
        int toplamDegeri = 0;

        int counter = 0;

        while(sayi > 0 || sayi < 0){
            toplamDegeri += sayi % 10;
            sayi /= 10;
            counter++;
        }


        System.out.println("Girdiğiniz sayının basamak değeri : "+toplamDegeri);
        System.out.println("Döngü Sayısı : "+ counter);


    }
}
