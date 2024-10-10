package day00_GeneralPractice;

import java.util.Arrays;

public class C04_Anagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("apple", "ppale"));
        System.out.println(isAnagram_1("apple", "ppale"));

    }
    /**
     * Verilen iki kelimenin birbirinin anagramı olup olmadığını kontrol eden bir
     * algoritma yazın. İki kelimenin anagram olması, aynı harfleri aynı sayıda
     * içermeleri anlamına gelir, ancak harflerin sıralaması farklı olabilir.
     *
     * Örnek:
     * Girdi 1: "listen", Girdi 2: "silent"
     * Çıktı: true (Bu iki kelime anagramdır.)
     * Girdi 1: "apple", Girdi 2: "papel"
     * Çıktı: true (Bu iki kelime anagramdır.)
     * Girdi 1: "hello", Girdi 2: "world"
     * Çıktı: false (Bu iki kelime anagram değildir.)
     */

    public static boolean isAnagram(String s , String str){

        for (int i = 0; i < s.length(); ) {
            String control = s.substring(0,1);
            if (s.replace(control,"").length() != str.replace(control,"").length() ){
                return false;
            }
            s = s.replace(control,"");
            str = str.replace(control,"");
        }
        return true;
    }

    public static boolean isAnagram_1(String s, String str) {
        if (s.length() != str.length()) {
            return false;
        }

        char[] sArray = s.toCharArray();
        char[] strArray = str.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(strArray);

        return Arrays.equals(sArray, strArray);
    }
}
