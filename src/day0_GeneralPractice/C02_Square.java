package day0_GeneralPractice;

import java.util.Arrays;

public class C02_Square {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(square3(3)));

    }

    /**
     * Given n>=0, create an array length n*n with the following pattern,
     * shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1}
     * (spaces added to show the 3 groups).
     * <p>
     * <p>
     * squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]  /2 - 5/4 - 8/7/6
     * squareUp(2) → [0, 1, 2, 1]
     * squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
     */

    public static int[] square(int n) {
        int[] result = new int[n * n];

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                result[(i * n) - j - 1] = j + 1;  //2 - 5/4 - 8/7/6
            }
        }
        return result;
    }

    public static int[] square2(int n) {
        // n*n boyutunda bir dizi oluştur
        int[] result = new int[n * n];

        // Dış döngü: Her satır için çalışır
        for (int i = 0; i < n; i++) {
            // İç döngü: Her satırda 1'den n'e kadar sayıları ters sırayla yerleştirir
            for (int j = 1; j <= i + 1; j++) {
                result[i * n + (n - j)] = j;
            }
        }

        return result;
    }

    public static int[] square3(int n) {
        int[] result = new int[n * n];

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i + 1; j++) {
                result[i * n + (n - j)] = j;
            }
        }
        return result;
    }
}
