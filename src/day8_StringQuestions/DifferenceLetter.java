package day8_StringQuestions;

public class DifferenceLetter {
    public static void main(String[] args) {

        String str = "zzazazaz";
        System.out.println("diffCountOfLetters(str) = " + diffCountOfLetters(str));
    }

    /**
     * Bir string içerisinde sadece A veya B harfi bulunmaktadır.
     * İkisinin farkını veren metodu yazınız...
     * Given AAAAABABA
     * output: 5
     * BBBBB
     * output:5
     * AAAAB
     * output:3
     */

    public static int diffCountOfLetters(String str) {
        int[] arr = new int[2];

        try {
            for (int i = 0, j = 0; i < str.length(); j++) {
                String control = str.substring(0, 1);
                arr[j] = str.length() - str.replace(control, "").length();
                str = str.replace(control, "");
            }
        } catch (Exception e) {
            System.out.println("iki farklı harf olmalı");
        }
        return Math.abs(arr[0] - arr[1]);
    }
}
