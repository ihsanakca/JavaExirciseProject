package day00_GeneralUsage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaxMirror{
    public static void main(String[] args) {

        int [] numbers = {1, 2, 3, 8, 9, 3, 2, 1};
        System.out.println("maxMirror(numbers) = " + maxMirror(numbers));
    }
    /**
     * We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array,
     * the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1}
     * is length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.
     *
     *
     * maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
     * maxMirror([1, 2, 1, 4]) → 3
     * maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2
     */


    public static int maxMirror(int[] nums) {
        int max = 0;
        int n = nums.length;

        // İlk döngü: her bir eleman için
        for (int i = 0; i < n; i++) {
            // İkinci döngü: dizinin sonundan başlayarak karşılaştırmalar yapar
            for (int j = n - 1; j >= 0; j--) {
                int length = 0;
                int x = i;
                int y = j;

                // Karşılık gelen elemanları kontrol eder ve ayna bölümünü genişletir
                while (x < n && y >= 0 && nums[x] == nums[y]) {
                    length++;
                    x++;
                    y--;
                }

                // En büyük ayna bölümünün uzunluğunu günceller
                max = Math.max(max, length);
            }
        }

        return max;
    }


}
