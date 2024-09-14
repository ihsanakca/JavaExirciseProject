package day00_GeneralUsage;

import java.util.Arrays;

public class SortEachPart {
    public static void main(String[] args) {
        /**
         * SSKD153321LDKSU
         * SSKD,153321,LDKSU
         * bu şekilde bi string değer veriliyor
         * her harf grubunu kendi içinde, her sayı grubunu da kendi içinde sıralamamı istiyor
         * çıktı: DKSS12335DKLSU
         */

        String str = "SSKD153454HHTRE65932LDKSUTT";
        System.out.println("siralama2(str) = " + siralama2(str));

    }
    public static String siralama(String str) {
        String sırala = "";
       // SSKD153321LDKSU
        for (int i = 0; i < str.length(); i++) {
            sırala += str.charAt(i);
            if (Character.isAlphabetic(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isDigit(str.charAt(i + 1))) {
                    sırala += ",";
                }

            }
            if (Character.isDigit(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isAlphabetic(str.charAt(i + 1))) {
                    sırala += ",";
                }

            }
        }
        System.out.println("sırala = " + sırala);
        String[] arr = sırala.split(",");
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        String newStr = "";
        for (String each : arr) {
            char[] chars = each.toCharArray();
            Arrays.sort(chars);
            for (char eachChar : chars) {
                newStr += eachChar;
            }
        }
        return newStr;
    }

    public static String siralama2(String str) {
        String[] parts = str.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        System.out.println("Arrays.toString(parts) = " + Arrays.toString(parts));

        String sonuc = "";

        for (String each : parts) {
            char[] chars = each.toCharArray();
            System.out.println(Arrays.toString(chars));
            Arrays.sort(chars);
            System.out.println(Arrays.toString(chars));
            for (char eachChar : chars) {
                sonuc += eachChar;
            }
        }
        return sonuc;
    }
}
