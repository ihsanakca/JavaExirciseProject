package day00_GeneralUsage;

import java.util.Arrays;

public class SquareUp {
    public static void main(String[] args) {
        System.out.println("Arrays.toString(squareUp(6)) = " + Arrays.toString(squareUp(6)));
    }
    /**
     *
     Given n>=0, create an array length n*n with the following pattern,
     shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).

     squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
     squareUp(2) → [0, 1, 2, 1]
     squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
     */

    private static int [] squareUp(int n ){
        int [] result = new int[n*n];
        for (int i = 1; i <=n ; i++) {
            for (int j = i*n, k=1; k <= i; j--,k++) {
                result[j-1] = k;
            }

        }
        return result;
    }

    public static int[] squareUp_1(int n) {
        if (n == 0) {
            return new int[0];
        }

        int[] result = new int[n * n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                result[i * n + (n - 1 - j)] = j + 1;
            }
        }

        return result;
    }
}
