package day00_GeneralUsage;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reversedNumber(701));

    }

    public static int reversedNumber(int number){

        int reversedNumber = 0;

        do {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        } while (number != 0);

        return reversedNumber;
    }
}
