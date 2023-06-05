package day00_GeneralUsage;

import java.util.*;

public class SSSSS {

    public static void main(String[] args) {
        String[] strArr = {"Ahmet", "Yavuz", "Selim", "Halim"};

        String result = String.join("+", strArr);

        System.out.println("result = " + result);
        ucgen(7);


    }

    public static void ucgen(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

