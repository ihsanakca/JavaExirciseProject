package day15_Arrays_Multi;

import java.util.Arrays;

public class C04_ArrayTask_3 {
    public static void main(String[] args) {

        String sonKelimeTers = sonKelimeTers("verilen bir cümledeki son kelimeyi tersten veren metod nedir");
        System.out.println("sonKelimeTers = " + sonKelimeTers);


    }
    // verilen bir cümledeki son kelimeyi tersten veren metod nedir.

    public static String sonKelimeTers(String cumle) {
        String[] kelimeler = cumle.split(" ");

       String sonKelimeTersHali = reverse(kelimeler[kelimeler.length-1]);

        return sonKelimeTersHali;
    }

    public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}
