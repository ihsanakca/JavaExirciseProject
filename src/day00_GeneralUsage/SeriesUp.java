package day00_GeneralUsage;

import java.util.Arrays;

public class SeriesUp {
    public static void main(String[] args) {
        System.out.println("Arrays.toString(seriesUp(4)) = " + Arrays.toString(seriesUp(4)));
    }
    /**
     * Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n}
     * (spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n,
     * which is known to sum to exactly n*(n + 1)/2.
     *
     *
     * seriesUp(3) → [1, 1, 2, 1, 2, 3]
     * seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
     * seriesUp(2) → [1, 1, 2]
     */

    public static int [] seriesUp(int n){
        int [] result = new int[n*(n+1)/2];
        int index = 0;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                result[index++] = j;
            }
        }
        return result;
    }
}
