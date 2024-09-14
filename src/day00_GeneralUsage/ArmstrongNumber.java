package day00_GeneralUsage;

import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumber {
    public static void main(String[] args) {
        /**
         * Bir sayının "Armstrong sayısı" olup olmadığını kontrol eden bir Java kodu yazınız.
         *
         * Not: Armstrong sayısı, basamaklarındaki sayıların her birinin küplerinin toplamı kendisine eşit olan sayıdır.
         * 1^3 + 5^3 + 3^3 equals 153.
         * 1^4 + 6^4 + 3^4 + 4^4 = 1634
         */

        System.out.println("isArmstrong(1634) = " + isArmstrong(93084));

          System.out.println("armstrongNumbers(1000) = " + armstrongNumbers(100000));
    }

    public static List<Integer> armstrongNumbers(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (isArmstrong(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public static boolean isArmstrong(int m) {
        int n = m;
        int numberOfDigit = String.valueOf(m).length();
        int cubeValue = 0;
        
        while (n > 0) {
            int lastDigit = n % 10;
                cubeValue += Math.pow(lastDigit, numberOfDigit);
            n /= 10;
        }
        return m == cubeValue;
    }
}
