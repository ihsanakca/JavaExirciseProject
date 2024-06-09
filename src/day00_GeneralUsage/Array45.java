package day00_GeneralUsage;

import java.util.Arrays;

public class Array45 {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 1, 5, 5, 4, 1 ,4,5,6};

        System.out.println("Arrays.toString(fix34(numbers)) = " + Arrays.toString(fix34(numbers)));
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
    }

    /**
     * Return an array that contains exactly the same numbers as the given array,
     * but rearranged so that every 3 is immediately followed by a 4. Do not move the 3's,
     * but every other number may move. The array contains the same number of 3's and 4's,
     * every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.
     * <p>
     * <p>
     * fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
     * fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
     * fix34([3, 2, 2, 4]) → [3, 4, 2, 2]
     */

    public static int[] fix34(int[] nums) {
        int[] clone = nums.clone();
        for (int i = 0; i < clone.length; i++) {
            if (clone[i] == 4 && clone[i + 1] != 5) {
                int temp = clone[i + 1];
                for (int j = 0; j < clone.length; j++) {
                    if (j==0 && clone[j] == 5){
                        clone[i+1] = clone[j];
                        clone[j] = temp;
                        break;
                    }
                    if (clone[j] == 5 &&  clone[j-1] != 4) {
                        clone[i+1] = clone[j];
                        clone[j] = temp;
                        break;
                    }
                }
            }
        }
       return clone;
    }
}
