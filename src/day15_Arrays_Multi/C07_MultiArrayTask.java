package day15_Arrays_Multi;

import java.util.Arrays;

public class C07_MultiArrayTask {
    public static void main(String[] args) {
        int[][] dimArr = {
                {2, 3, 4, 54},
                {5, 5, 25, 255, 5},
                {2, 8, 22, 36, 3},
                {20, 22, 8}
        };

        System.out.println("ikiBoyutluArrayToplami(dimArr) = " + ikiBoyutluArrayToplami(dimArr));
        System.out.println("ikiBoyutluArrayCiftToplami(dimArr) = " + ikiBoyutluArrayCiftToplami(dimArr));


    }
    //iki boyulu dizide verilen sayıları toplayan metodu yazınız..

    public static int ikiBoyutluArrayToplami(int[][] arr) {
        int toplam = 0;
        for (int[] ar : arr) {
            for (int a : ar) {
                toplam += a;
            }
        }
        return toplam;
    }

    // çift boyutlu arraydeki çift sayıları toplayan metodu yazınız.

    public static int ikiBoyutluArrayCiftToplami(int[][] arr) {
        int toplam = 0;
        for (int[] ar : arr) {
            for (int a : ar) {
                if (a % 2 == 0) {
                    toplam += a;
                }
            }
        }
        return toplam;
    }



}



